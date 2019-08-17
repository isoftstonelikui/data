package com.huawei.sort;

import org.junit.Test;

import java.util.Random;

/**
 * @Auther: likui
 * @Date: 2019/8/17 15:31
 * @Description:
 */
public class QuickSortTest {
    QuickSort quickSort = new QuickSort();

    @Test
    public void testQuickSort() {
        int[] array = getArray(new int[10]);
        quickSort.quickSort(array, 0, array.length - 1);
    }

    private int[] getArray(int[] ints) {
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(200);
        }
        return ints;
    }
}
