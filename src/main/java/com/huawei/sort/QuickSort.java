package com.huawei.sort;

import org.junit.Test;

import java.util.Random;

/**
 * @Auther: likui
 * @Date: 2019/8/17 16:25
 * @Description:
 */
public class QuickSort {
    public void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int i = low, j = high, index = array[i]; // 取最左边的数作为基准数
        while (i < j) {
            while (i < j && array[j] >= index) { // 向左寻找第一个小于index的数
                j--;
            }
            if (i < j) {
                array[i++] = array[j]; // 将array[j]填入array[i]，并将i向右移动
            }
            while (i < j && array[i] < index) {// 向右寻找第一个大于index的数
                i++;
            }
            if (i < j) {
                array[j--] = array[i]; // 将array[i]填入array[j]，并将j向左移动
            }
        }
        array[i] = index; // 将基准数填入最后的坑
        quickSort(array, low, i - 1); // 递归调用，分治
        quickSort(array, i + 1, high); // 递归调用，分治
    }
}
