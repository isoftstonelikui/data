package com.huawei.stack;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/14 12:37
 * @Description:
 */
public class WordReverse {
    @Test
    public void demo() {
        String str = reverse("abcde");
        System.out.println(str);
    }

    //单词逆序
    public String reverse(String str) {
        StringBuffer buffer = new StringBuffer();
        char[] chars = str.toCharArray();
        StackDemo stack = new StackDemo(chars.length);
        for (char aChar : chars) {
            stack.push(aChar);
        }
        for (int i = 0; i < chars.length; i++) {
            Character pop = (Character) stack.pop();
            buffer.append(pop);
        }
        return buffer.toString();
    }
}
