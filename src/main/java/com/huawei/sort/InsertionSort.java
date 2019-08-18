package com.huawei.sort;

import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/13 12:55
 * @Description: 插入排序，左边已全部有序
 */
public class InsertionSort {
    public static int[] insertSort(int[] ints) {
        int out;
        int in;
        for (out = 1; out < ints.length; out++) {
            int temp = ints[out];
            in = out;
            while (in > 0 && ints[in - 1] > temp) {
                ints[in] = ints[in - 1];
                in--;
            }
//            for (in = out; in > 0; in--) {
//                if (ints[in - 1] > temp) {
//                    ints[in] = ints[in - 1];
//                } else {
//                    break;
//                }
//
//            }
            ints[in] = temp;
        }
        return ints;
    }

    public static String[] insertSort2(String[] ints) {
        int out;
        int in;
        for (out = 1; out < ints.length; out++) {
            String temp = ints[out];
            in = out;
            while (in > 0 && ints[in - 1].compareTo(temp)>0) {
                ints[in] = ints[in - 1];
                in--;
            }
//            for (in = out; in > 0; in--) {
//                if (ints[in - 1] > temp) {
//                    ints[in] = ints[in - 1];
//                } else {
//                    break;
//                }
//
//            }
            ints[in] = temp;
        }
        return ints;
    }

}
