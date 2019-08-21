package com.huawei.hash;

import com.huawei.link.SingleLink;
import com.huawei.link.SortedSingleLinkList;

/**
 * @Auther: likui
 * @Date: 2019/8/20 22:41
 * @Description: 链地址法解决哈希冲突
 */
public class LinkHashTable {
    private SortedSingleLinkList[] hashArray;
    private int arraySize;

    public LinkHashTable(int arraySize) {
        this.arraySize = arraySize;
        hashArray = new SortedSingleLinkList[arraySize];
        for (int i = 0; i < arraySize; i++) {
            hashArray[i] = new SortedSingleLinkList();
        }
    }

    public void insert(SingleLink link) {
        int key = link.iData;
        int hashVal = hashFun(key);
        hashArray[hashVal].insert(link);
    }

    public void delete(int key) {
        int hashVal = hashFun(key);
        hashArray[hashVal].delete(key);
    }

    public SingleLink find(int key) {
        int hashVal = hashFun(key);
        SingleLink link = hashArray[hashVal].find(key);
        return link;
    }

    /**
     * 哈希函数
     *
     * @param key
     * @return
     */
    public int hashFun(int key) {
        return key % arraySize;
    }

}
