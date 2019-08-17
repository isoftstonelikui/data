package com.huawei.recurtion;

/**
 * @Auther: likui
 * @Date: 2019/8/16 19:28
 * @Description:
 */
public class RecurtionDemo1 {

    public long get(long n) {
        if (n == 1) {
            return 1;
        }
        return get(n - 1) + n;
    }

    //阶乘
    public long factorial(long n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    //递归二分查找法
    public int binarySearch(int[] ints, int target, int lower, int upper) {
        if (lower > upper) {
            throw new RuntimeException("target is not exist");
        }
        int middle = (lower + upper) / 2;
        if (ints[middle] == target) {
            return middle;
        }
        if (ints[middle] > target) {
            upper = middle - 1;
            return binarySearch(ints, target, lower, upper);
        } else {
            lower = middle + 1;
            return binarySearch(ints, target, lower, upper);
        }
    }

    //归并排序，将两个已有序数组组成新的有序数组
    public int[] merge(int[] sourceA, int[] sourceB, int[] target) {
        int aDex = 0;
        int bDex = 0;
        int cDex = 0;
        while (aDex < sourceA.length && bDex < sourceB.length) {
            if (sourceA[aDex] < sourceB[bDex]) {
                target[cDex++] = sourceA[aDex++];
            } else {
                target[cDex++] = sourceB[bDex++];
            }
        }
        while (aDex < sourceA.length) {
            target[cDex++] = sourceA[aDex++];
        }
        while (bDex < sourceB.length) {
            target[cDex++] = sourceB[bDex++];
        }
        return target;
    }

    //递归实现无序数组的归并排序
    public int[] merge(int[] source, int lower, int middle, int upper) {
//待完善
        return null;
    }

}
