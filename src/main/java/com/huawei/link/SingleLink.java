package com.huawei.link;

/**
 * @Auther: likui
 * @Date: 2019/8/15 19:54
 * @Description: 单链表
 */
public class SingleLink {
    public int iData;
    public SingleLink next;

    public SingleLink() {

    }

    public SingleLink(int iData, SingleLink next) {
        this.iData = iData;
        this.next = next;
    }

    public void display() {
        System.out.println("iData:" + iData);
    }
}
