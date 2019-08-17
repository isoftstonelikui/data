package com.huawei.recurtion;

import com.huawei.queue.QueueDemo;
import com.huawei.stack.StackDemo;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: likui
 * @Date: 2019/8/17 08:12
 * @Description: 递归小应用
 */
public class RecurtionApply {
    //求乘方，通过递归较少计算次数，并且只使用乘法
    public long power(int i, int j) {
        if (j == 1) {
            return i;
        }
        if (j % 2 == 0) {
            return power(i * i, j / 2);
        }
        return i * power(i * i, j / 2);
    }

    //背包问题，选中几个数的和恰好是给定的数
    public void getSum(LinkedList<Integer> list, int target) {
//待完善
    }
}
