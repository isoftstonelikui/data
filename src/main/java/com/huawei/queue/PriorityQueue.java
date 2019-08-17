package com.huawei.queue;

/**
 * @Auther: likui
 * @Date: 2019/8/14 21:10
 * @Description: 优先级队列（队列按关键值有序），一般用堆实现，也可用数组实现，但是插入会比较慢
 */
public class PriorityQueue {
    public int maxSize;
    public int[] elementData;
    public int elementCount;

    public PriorityQueue() {
        this(10);
    }

    public PriorityQueue(int initCapacity) {
        this.elementCount = 0;
        this.maxSize = initCapacity;
        elementData = new int[maxSize];
    }

    public int peek() {
        if (elementCount == 0) {
            throw new RuntimeException("queue is empty");
        }
        return elementData[elementCount - 1];
    }

    public void add(int item) {
        if (elementCount == maxSize) {
            throw new RuntimeException("queue is full");
        }
        int i = 0;
        for (i = 0; i < elementCount; i++) {
            if (elementData[i] > item) {
                for (int j = elementCount - 1; j >= i; j--) {
                    elementData[j + 1] = elementData[j];
                }
                break;
            }
        }
        elementData[i] = item;
        elementCount++;
    }

    public int remove() {
        if (elementCount == 0) {
            throw new RuntimeException("queue is empty");
        }
        elementData[elementCount - 1] = 0;
        return elementData[--elementCount];
    }
}
