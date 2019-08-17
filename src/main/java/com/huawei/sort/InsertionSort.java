package com.huawei.sort;

import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/13 12:55
 * @Description: 插入排序，左边已全部有序
 */
public class InsertionSort {
    @Test
    public void demo1() {
        int[] ints = {2, 4, 1, 8, 5, 7, 10, 9};
        insertSort(ints);
    }

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

    @Test
    public void demo2() {
        String[] ints = {"ab","ac","dd","cd","cb"};
        insertSort2(ints);
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
