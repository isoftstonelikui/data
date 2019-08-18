package com.huawei.sort;

import org.junit.Test;

import java.awt.image.ShortLookupTable;

/**
 * @Auther: likui
 * @Date: 2019/8/13 08:11
 * @Description: 冒泡排序，从最左边开始一次和右边一个比较，如不符合要求就交换
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] ints) {

        for (int out = ints.length - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                if (ints[in] > ints[in + 1]) {
                    swap(ints,in,in+1);
                }
            }
        }
        return ints;
    }

    private static void swap(int[] ints, int a, int b) {
        int temp = ints[a];
        ints[a] = ints[b];
        ints[b] = temp;
    }

    public static String[] bubbleSort2(String[] ints) {

        for (int out = ints.length - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                if (ints[in].compareTo(ints[in + 1])>0) {
                    swap(ints,in,in+1);
                }
            }
        }
        return ints;
    }

    private static void swap(String[] ints, int a, int b) {
        String temp = ints[a];
        ints[a] = ints[b];
        ints[b] = temp;
    }

}
