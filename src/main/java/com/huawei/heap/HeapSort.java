package com.huawei.heap;

/**
 * @Auther: likui
 * @Date: 2019/8/23 20:31
 * @Description:
 */
public class HeapSort {

    public void sort(int[] ints) {
        int length = ints.length;
        HeapArray heapArray = new HeapArray(length);
        for (int anInt : ints) {
            heapArray.insert(anInt);
        }
        for (int i = 0; i < length; i++) {
            ints[i] = (Integer) heapArray.remove().iData;
        }
    }
}
