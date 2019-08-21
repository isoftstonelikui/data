package com.huawei.link;

/**
 * @Auther: likui
 * @Date: 2019/8/21 07:56
 * @Description: 有序链表
 */
public class SortedSingleLinkList {
    private SingleLink first;

    public SortedSingleLinkList() {
        this.first = null;
    }

    public void insert(SingleLink link) {
        int key = link.iData;
        SingleLink previous = null;
        SingleLink current = first;
        //
        while (current != null && current.iData < key) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = link;
        } else {
            previous.next = link;
        }
        link.next = current;
    }

    public void delete(int key) {
        SingleLink current = first;
        SingleLink previous = null;
        while (current != null && current.iData != key) {
            if (current.next == null) {
                throw new RuntimeException("不存在要删除的元素");
            } else {
                previous = current;
                current = current.next;
            }
        }
        //删除
        if (previous == null) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
    }

    public SingleLink find(int key) {
        SingleLink current = first;
        while (current != null && current.iData <= key) {
            if (current.iData == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void display() {
        SingleLink current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
}
