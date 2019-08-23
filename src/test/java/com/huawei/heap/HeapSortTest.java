package com.huawei.heap;

import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/23 23:00
 * @Description:
 */
public class HeapSortTest {
    @Test
    public void testHeapSort() {
        HeapSort heapSort = new HeapSort();
        int[] ints = {9, 6, 8, 4, 5, 7, 3};
        heapSort.sort(ints);
    }
}
