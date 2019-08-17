package com.huawei.recurtion;

import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/16 19:37
 * @Description:
 */
public class RecurtionDemo1Test {
    RecurtionDemo1 recurtion = new RecurtionDemo1();

    @Test
    public void testGet() {
        long i = recurtion.get(100L);
        System.out.println(i);
    }

    @Test
    public void testFactorial() {
        long factorial = recurtion.factorial(5L);
        System.out.println(factorial);
    }

    @Test
    public void binarySearchTest() {
        int[] ints = {1, 3, 5, 6, 8, 10, 13};
        int search = recurtion.binarySearch(ints, 15, 0, ints.length - 1);
        System.out.println(search);
    }

    @Test
    public void mergeTest() {
        int[] sourceA = {23, 47, 81, 95};
        int[] sourceB = {7, 14, 39, 55, 62, 74};
        int[] target = new int[sourceA.length + sourceB.length];
        int[] merge = recurtion.merge(sourceA, sourceB, target);
        System.out.println(merge);
    }
}
