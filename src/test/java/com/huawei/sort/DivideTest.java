package com.huawei.sort;

import org.junit.Test;

import java.util.Random;

/**
 * @Auther: likui
 * @Date: 2019/8/17 14:46
 * @Description:
 */
public class DivideTest {
    Divide divide = new Divide();

    @Test
    public void divideTest() {
        int[] array = getArray(new int[10]);
        int[] divide = this.divide.divide(array, -5);
    }

    private int[] getArray(int[] ints) {
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }
        return ints;
    }
}
