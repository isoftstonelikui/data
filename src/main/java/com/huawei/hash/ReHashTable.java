package com.huawei.hash;

/**
 * @Auther: likui
 * @Date: 2019/8/20 22:17
 * @Description: 开放地址法使用再哈希法决定探测步长
 */
public class ReHashTable {
    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem;

    public ReHashTable(int arraySize) {
        this.arraySize = arraySize;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);
    }

    /**
     * 查找算法未考虑hash表满的情况，hash表是不允许满的，因具备扩容机制，此处没有实现
     *
     * @param key
     * @return
     */
    public DataItem find(int key) {
        int hashVal = hashFun(key);
        int stepSize = reHashFun(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getiData() == key) {
                return hashArray[hashVal];
            }
            hashVal += stepSize;
            hashVal = hashVal % arraySize;
        }
        return null;
    }

    /**
     * 此处不够完善，插入数据时有可能数组还有空闲，但是无法探测到null的位置，
     * 造成死循环，再哈希化应使得stepSize和arraySize互质
     *
     * @param key
     */
    public void insert(int key) {
        int hashVal = hashFun(key);
        int stepSize = reHashFun(key);
        while (hashArray[hashVal] != null && hashArray[hashVal].getiData() != -1) {
            hashVal += stepSize;
            hashVal = hashVal % arraySize;
        }
        hashArray[hashVal] = new DataItem(key);
    }

    public DataItem delete(int key) {
        int hashVal = hashFun(key);
        int stepSize = reHashFun(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getiData() == key) {
                DataItem temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }
            hashVal += stepSize;
            hashVal = hashVal % arraySize;
        }
        return null;
    }

    public int hashFun(int key) {
        return key % arraySize;
    }

    public int reHashFun(int key) {
        return 5 - key % 5;
    }

    public void display() {
        for (DataItem dataItem : hashArray) {
            if (dataItem.getiData() != null) {
                System.out.print(dataItem.getiData() + "  ");
            } else {
                System.out.print("**");
            }
        }
    }
}
