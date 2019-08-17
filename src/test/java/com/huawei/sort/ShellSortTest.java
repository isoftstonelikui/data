package com.huawei.sort;

import org.junit.Test;

import java.util.Random;

/**
 * @Auther: likui
 * @Date: 2019/8/17 11:39
 * @Description:
 */
public class ShellSortTest {
    ShellSort shellSort=new ShellSort();

    @Test
    public void shellTest() {
        int[] ints = new int[1000];
        int[] array = getArray(ints);
        int[] result = shellSort.shellSort(array);
    }

    private int[] getArray(int[] ints) {
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1000000);
        }
        return ints;
    }
}
