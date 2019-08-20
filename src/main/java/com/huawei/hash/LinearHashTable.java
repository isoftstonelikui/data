package com.huawei.hash;


/**
 * @Auther: likui
 * @Date: 2019/8/20 20:49
 * @Description: 开放地址法采用线性探测解决哈希冲突
 */
public class LinearHashTable {
    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem;

    public LinearHashTable(int arraySize) {
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
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getiData() == key) {
                return hashArray[hashVal];
            }
            hashVal++;
            hashVal = hashVal % arraySize;
        }
        return null;
    }

    public void insert(int key) {
        int hashVal = hashFun(key);
        while (hashArray[hashVal] != null && hashArray[hashVal].getiData() != -1) {
            hashVal++;
            hashVal = hashVal % arraySize;
        }
        hashArray[hashVal] = new DataItem(key);
    }

    public DataItem delete(int key) {
        int hashVal = hashFun(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getiData() == key) {
                DataItem temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }
            hashVal++;
            hashVal = hashVal % arraySize;
        }
        return null;
    }

    public int hashFun(int key) {
        return key % arraySize;
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
