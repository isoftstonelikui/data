package com.huawei.link;

/**
 * @Auther: likui
 * @Date: 2019/8/15 20:01
 * @Description:
 */
public class SingleLinkList {
    private SingleLink first;

    public SingleLinkList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(SingleLink link) {
        link.next = first;
        first = link;
    }

    public SingleLink deleteFirst() {
        if (isEmpty()) {
            throw new RuntimeException("链表中无元素");
        }
        SingleLink link = first;
        first = first.next;
        return link;
    }

    public void display() {
        SingleLink current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

    //查找指定节点
    public SingleLink find(int data) {
        SingleLink current = first;
        while (current.iData != data) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    //在指定节点之后插入
    public void insertAfter(int targetData, int sourceData) {
        SingleLink current = first;
        while (current.iData != targetData) {
            if (current.next == null) {
                throw new RuntimeException("不存在要插入的元素");
            } else {
                current = current.next;
            }
        }
        //找到节点
        SingleLink next = current.next;
        SingleLink link = new SingleLink(sourceData, next);
        current.next = link;
    }

    //删除指定节点
    public SingleLink delete(int data) {
        SingleLink current = first;
        SingleLink previous = null;
        while (current != null && current.iData != data) {
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
        }else{
            previous.next = current.next;
        }
        return current;
    }
}
