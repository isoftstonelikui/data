package com.huawei.array;

import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/18 08:37
 * @Description:
 */
public class ArrayDemo1Test {

    ArrayDemo1 array=new ArrayDemo1();

    @Test
    public void deleteTest() {
        String[] strings = new String[10];
        strings[0] = "a";
        strings[1] = "b";
        strings[2] = "c";
        strings[3] = "b";
        strings[4] = "e";
        String[] as = array.delete(strings, "b");
    }

    @Test
    public void findTest() {
        int[] ints = {1, 2, 5, 8, 10};
        int i = array.find(ints, 5, 4);
    }
}
