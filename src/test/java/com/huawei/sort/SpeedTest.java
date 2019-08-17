package com.huawei.sort;

import org.junit.Test;

import java.util.Random;

/**
 * @Auther: likui
 * @Date: 2019/8/13 22:29
 * @Description:
 */
public class SpeedTest {
    ShellSort shellSort = new ShellSort();
    QuickSort quickSort = new QuickSort();
    RadixSort radixSort = new RadixSort();

    @Test
    public void demo1() {
        int[] ints = new int[10000000];
        int[] array = getArray(ints);
/*        //冒泡排序
        long l = System.currentTimeMillis();
        BubbleSort.bubbleSort(array);
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
        //选择排序
        array = getArray(ints);
        long l2 = System.currentTimeMillis();
        SelectionSort.selectionSort(array);
        long l3 = System.currentTimeMillis();
        System.out.println(l3 - l2);*/
        //插入排序
//        array = getArray(ints);
//        long l4 = System.currentTimeMillis();
//        InsertionSort.insertSort(array);
//        long l5 = System.currentTimeMillis();
//        System.out.println(l5 - l4);
        //希尔排序
        array = getArray(ints);
        long l6 = System.currentTimeMillis();
        shellSort.shellSort(array);
        long l7 = System.currentTimeMillis();
        System.out.println(l7 - l6);
        //快速排序
        array = getArray(ints);
        long l8 = System.currentTimeMillis();
        quickSort.quickSort(array, 0, array.length - 1);
        long l9 = System.currentTimeMillis();
        System.out.println(l9 - l8);
        //基数排序
        array = getArray(ints);
        long l10 = System.currentTimeMillis();
        radixSort.radixSort(array);
        long l11 = System.currentTimeMillis();
        System.out.println(l11 - l10);
    }

    private int[] getArray(int[] ints) {
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100000000);
        }
        return ints;
    }

    @Test
    public void demo2() {
        String[] ints = new String[10000];
        String[] array = getArray(ints);
        //
        long l = System.currentTimeMillis();
        BubbleSort.bubbleSort2(array);
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
        //
        array = getArray(ints);
        long l2 = System.currentTimeMillis();
        SelectionSort.selectionSort2(array);
        long l3 = System.currentTimeMillis();
        System.out.println(l3 - l2);
        //
        array = getArray(ints);
        long l4 = System.currentTimeMillis();
        InsertionSort.insertSort2(array);
        long l5 = System.currentTimeMillis();
        System.out.println(l5 - l4);

    }

    private String[] getArray(String[] strings) {
        Random random = new Random();
        for (int j = 0; j < strings.length; j++) {
            String temp = "";
            for (int i = 0; i < 4; i++) {
                int i1 = random.nextInt(26);
                char c = (char) (i1 + 97);
                temp = temp + c;
            }
            strings[j] = temp;
        }
        return strings;
    }
}
