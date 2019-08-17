package com.huawei.queue;

/**
 * @Auther: likui
 * @Date: 2019/8/14 20:13
 * @Description:
 */
public class QueueDemo {
    public int elementCount;
    public int front;
    public int rear;
    public Object[] elementData;

    public QueueDemo() {
        this(10);
    }

    public QueueDemo(int initCapacity) {
        front = 0;
        rear = -1;
        elementCount = 0;
        elementData = new Object[initCapacity];
    }

    public Object peek() {
        if (elementCount == 0) {
            throw new RuntimeException("queue is empty");
        }
        return elementData[front];
    }

    public void add(Object object) {
        if (elementCount == elementData.length) {
            throw new RuntimeException("queue is full");
        }
        if (rear == elementData.length - 1) {
            rear = -1;
        }
        elementData[++rear] = object;
        elementCount++;
    }

    public Object remove() {
        if (elementCount == 0) {
            throw new RuntimeException("queue is empty");
        }
        Object temp = elementData[front];
        elementData[front] = null;
        front++;
        if (front == elementData.length) {
            front = 0;
        }
        elementCount--;
        return temp;
    }

    public boolean isEmpty() {
        return elementCount == 0;
    }
}
