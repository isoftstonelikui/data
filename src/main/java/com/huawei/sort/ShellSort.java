package com.huawei.sort;

/**
 * @Auther: likui
 * @Date: 2019/8/17 11:04
 * @Description: 希尔排序
 */
public class ShellSort {
    public int[] shellSort(int[] ints) {
        int out;
        int in;
        int h = 1;
        while (h <= ints.length / 3) {
            h = 3 * h + 1;
        }
        while (h > 0) {
            for (out = h; out < ints.length; out++) {
                int temp = ints[out];
                in = out;
                while (in > h - 1 && ints[in - h] > temp) {
                    ints[in] = ints[in - h];
                    in -= h;
                }
                ints[in] = temp;
            }
            h = (h - 1) / 3;
        }
        return ints;
    }
}
