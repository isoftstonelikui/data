package com.huawei.sort;

/**
 * @Auther: likui
 * @Date: 2019/8/17 14:26
 * @Description: 划分算法
 */
public class Divide {
    public int[] divide(int[] ints, int pivot) {
        int left = -1;
        int right = ints.length;
        //
        while (left < right && left < ints.length - 1) {
            if (ints[++left] > pivot) {
                while (right > left) {
                    if (ints[--right] < pivot) {
                        swap(ints, left, right);
                        break;
                    }
                }
            }
        }

        return ints;
    }

    private void swap(int[] ints, int a, int b) {
        int temp = ints[a];
        ints[a] = ints[b];
        ints[b] = temp;
    }
}
