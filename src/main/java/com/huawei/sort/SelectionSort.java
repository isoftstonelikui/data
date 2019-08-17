package com.huawei.sort;

import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/13 12:24
 * @Description: 选择排序，从最左边开始找到最小的数，并和左边第一个交换
 */
public class SelectionSort {
    @Test
    public void demo1() {
        int[] ints = {2, 4, 1, 8, 5};
        selectionSort(ints);
    }

    public static int[] selectionSort(int[] ints) {
        int temp = 0;
        for (int out = 0; out < ints.length; out++) {
            temp = out;
            for (int in = out; in < ints.length; in++) {
                if (ints[temp] > ints[in]) {
                    temp = in;
                }
            }
            swap(ints, out, temp);
        }
        return ints;
    }

    private static void swap(int[] ints, int a, int b) {
        int temp = ints[a];
        ints[a] = ints[b];
        ints[b] = temp;
    }

    @Test
    public void demo2() {
        String[] ints = {"ab","ac","dd","cd","cb"};
        selectionSort2(ints);
    }

    public static String[] selectionSort2(String[] ints) {
        int temp = 0;
        for (int out = 0; out < ints.length; out++) {
            temp = out;
            for (int in = out; in < ints.length; in++) {
                if (ints[temp].compareTo(ints[in])>0) {
                    temp = in;
                }
            }
            swap(ints, out, temp);
        }
        return ints;
    }

    private static void swap(String[] ints, int a, int b) {
        String temp = ints[a];
        ints[a] = ints[b];
        ints[b] = temp;
    }
}
