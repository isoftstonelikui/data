package com.huawei.link;

import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/15 20:13
 * @Description:
 */
public class SingleLinkListTest {
    @Test
    public void demo1() {
        SingleLinkList linkList = new SingleLinkList();
        SingleLink link1 = new SingleLink(1, null);
        SingleLink link2 = new SingleLink(2, link1);
        SingleLink link3 = new SingleLink(3, link2);
        //
        linkList.insertFirst(link1);
        linkList.insertFirst(link2);
        linkList.insertFirst(link3);
        //
        SingleLink link = linkList.find(2);
        linkList.insertAfter(2, 4);
        SingleLink delete = linkList.delete(2);
    }
}
