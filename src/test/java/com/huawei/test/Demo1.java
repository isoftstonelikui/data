package com.huawei.test;

import com.huawei.stack.StackDemo;
import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/12 22:30
 * @Description:
 */
public class Demo1 {

    @Test
    public void demo1() {
        int result = calculate("2963/+5-*4+");
        System.out.println(result);
    }

    private int calculate(String expression) {
        //
        int result = 0;
        char[] chars = expression.toCharArray();
        StackDemo stack = new StackDemo(expression.length());
        for (char aChar : chars) {
            if (isNumber(aChar)) {
                stack.push(Character.getNumericValue(aChar));
            } else {
                Integer pop = (Integer) stack.pop();
                Integer pop1 = (Integer) stack.pop();
                result = symbol(aChar, pop1, pop);
                stack.push(result);
            }
        }
        return result;
    }

    private boolean isNumber(char aChar) {
        int i = aChar;
        if (i >= 48 && i <= 57) {
            return true;
        }
        return false;
    }

    private int symbol(char aChar, int a, int b) {
        int result = 0;
        switch (aChar) {
            case ('+'):
                result = a + b;
                break;
            case ('-'):
                result = a - b;
                break;
            case ('*'):
                result = a * b;
                break;
            case ('/'):
                result = a / b;
                break;
        }
        return result;
    }
}
