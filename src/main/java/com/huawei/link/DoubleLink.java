package com.huawei.link;

/**
 * @Auther: likui
 * @Date: 2019/8/15 22:11
 * @Description: 双向链表
 */
public class DoubleLink {
    public int iData;
    public DoubleLink next;
    public DoubleLink previous;

    public DoubleLink(int iData) {
        this.iData = iData;
    }

    public void display(){
        System.out.println();
    }
}
