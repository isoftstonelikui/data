package com.huawei.array;

/**
 * @Auther: likui
 * @Date: 2019/8/12 12:28
 * @Description:
 */
public class ArrayDemo1 {

    //删除数组中指定元素（所有都删除）
    public String[] delete(String[] strings, String string) {
        //校验string，规定非null
        if (string == null) {
            return strings;
        }
        //查找并删除
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                break;
            }
            //查找到相同元素，则删除并将后续元素前移
            if (string.equals(strings[i])) {
                for (int j = i; j < strings.length; j++) {
                    strings[j] = strings[j + 1];
                    if (strings[j + 1] == null) {
                        break;
                    }
                }
                //下标要减一
                i = i - 1;
            }
        }
        return strings;
    }

    //有序数组的二分查找法
    public int find(int[] ints, int nElements, int i) {
        int low = 0;
        int high = nElements - 1;
        int curIn = 0;
        while (true) {
            if (i > ints[high] || i < ints[low]) {
                return -1;
            }
            curIn = (low + high) / 2;
            if (ints[curIn] == i) {
                return curIn;
            }
            if (ints[curIn] > i) {
                high = curIn - 1;
            }
            if (ints[curIn] < i) {
                low = curIn + 1;
            }
        }
    }
}
