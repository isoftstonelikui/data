package com.huawei.link;

/**
 * @Auther: likui
 * @Date: 2019/8/15 22:11
 * @Description:
 */
public class DoubleLinkList {
    private DoubleLink first;
    private DoubleLink last;

    public DoubleLinkList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        DoubleLink link = new DoubleLink(data);
        if (isEmpty()) {
            last = link;
            first = link;
        } else {
            first.previous = link;
            link.next = first;
            first = link;
        }


    }

    public void insertLast(int data) {
        DoubleLink link = new DoubleLink(data);
        if (isEmpty()) {
            last = link;
            first = link;
        } else {
            last.next = link;
            link.previous = last;
            last = link;
        }
    }

    public DoubleLink deleteFirst() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        DoubleLink current=first;
        if (first.next == null) {
            first = null;
            last = null;
        } else {
            first = first.next;
            first.previous = null;
        }
        return current;
    }

    public DoubleLink deleteLast() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        DoubleLink current = last;
        if (last.previous == null) {
            first = null;
            last = null;
        } else {
            last = last.previous;
            last.next = null;
        }
        return current;
    }

    public void insertAfter(int targetData, int sourceData) {
        //
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        //
        DoubleLink current = first;
        while (current.iData != targetData) {
            if (current.next == null) {
                throw new RuntimeException("can not find the exact data");
            }
            current = current.next;
        }
        //在current之后插入
        DoubleLink link = new DoubleLink(sourceData);
        if (current.next == null) {
            //最后一个元素
            current.next = link;
            link.previous = last;
            last = link;
        } else {
            //不是最后一个元素
            link.next = current.next;
            current.next.previous = link;
            current.next = link;
            link.previous = current;
        }

    }

    public DoubleLink deleteKey(int data) {
        //
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        //
        DoubleLink current = first;
        while (current.iData != data) {
            if (current.next == null) {
                throw new RuntimeException("can not find the exact data");
            }
            current = current.next;
        }
        //删除
        if (current.next == null && current.previous == null) {
            first = null;
            last = null;
        } else if (current.previous == null) {
            first = current.next;
            first.previous = null;
        } else if (current.next == null) {
            last = current.previous;
            last.next = null;
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        return current;
    }

    public void display() {
        DoubleLink current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

    public DoubleLink find(int data) {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        DoubleLink current = first;
        while (current.iData != data) {
            if (current.next == null) {
                throw new RuntimeException("can not find the exact data");
            }
            current = current.next;
        }
        return current;
    }
}
