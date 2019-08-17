package com.huawei.recurtion;

import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/17 08:25
 * @Description:
 */
public class RecurtionApplyTest {
    RecurtionApply recurtionApply=new RecurtionApply();
    @Test
    public void testPower(){
        long power = recurtionApply.power(2, 7);
        System.out.println(power);
    }
}
