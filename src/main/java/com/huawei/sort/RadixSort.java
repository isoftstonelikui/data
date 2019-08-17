package com.huawei.sort;

import com.huawei.link.DoubleLinkList;

/**
 * @Auther: likui
 * @Date: 2019/8/17 18:43
 * @Description: 基数排序
 */
public class RadixSort {

    public int[] radixSort(int[] ints) {
        //用于存储几位数
        int digit = 0;
        //构造10个链表用于存储数据
        DoubleLinkList[] links = {new DoubleLinkList(), new DoubleLinkList(), new DoubleLinkList(),
                new DoubleLinkList(), new DoubleLinkList(), new DoubleLinkList(),
                new DoubleLinkList(), new DoubleLinkList(), new DoubleLinkList(), new DoubleLinkList()};
        //获取最高位数
        for (int anInt : ints) {
            int anIntDigit = getDigit(anInt);
            if (anIntDigit > digit) {
                digit = anIntDigit;
            }
        }
        for (int i = 1; i <= digit; i++) {
            //存入链表
            for (int anInt : ints) {
                int j = (int) ((anInt % Math.pow(10, i)) / Math.pow(10, i - 1));
                links[j].insertLast(anInt);
            }
            //存回数组
            int index = 0;
            for (int k = 0; k < digit; k++) {
                for (DoubleLinkList link : links) {
                    while (!link.isEmpty()) {
                        ints[index++] = link.deleteFirst().iData;
                    }
                }
            }
        }
        return ints;
    }

    private int getDigit(int number) {
        int count = 1;
        while ((number = number / 10) != 0) {
            count++;
        }
        return count;
    }
}
