package com.huawei.heap;

import com.huawei.tree.binary.Node;

/**
 * @Auther: likui
 * @Date: 2019/8/22 20:16
 * @Description: 用数组实现的堆
 */
public class HeapArray {
    private Node[] array;
    private int arraySize;
    private int currentSize;

    public HeapArray() {
        this(10);
    }

    public HeapArray(int arraySize) {
        this.arraySize = arraySize;
        array = new Node[arraySize];
        currentSize = 0;
    }

    /**
     * 插入节点，先插入最后，再向上滚
     *
     * @param key
     * @return
     */
    public boolean insert(int key) {
        //如果数组已满，不允许插入
        if (currentSize == arraySize) {
            return false;
        }
        Node node = new Node(key);
        array[currentSize] = node;
        //向上比较，找到合适位置
        tricleUp(currentSize++);
        return true;
    }

    private void tricleUp(int index) {
        int parent = (index - 1) / 2;
        Node bottom = array[index];
        while (index > 0 && (Integer) array[parent].iData < (Integer) bottom.iData) {
            array[index] = array[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        array[index] = bottom;
    }

    /**
     * 移除是指移除关键值最大的节点，即根节点
     *
     * @return
     */
    public Node remove() {
        Node root = array[0];
        //将最后一个元素放到根的位置
        array[0] = array[--currentSize];
        array[currentSize] = null;
        //向下比较，找到合适位置
        tricleDown(0);

        return root;
    }

    private void tricleDown(int index) {
        Node top = array[index];
        int largeChild;
        //
        while (index < currentSize / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            if (leftChild == currentSize - 1 || (leftChild < currentSize && (Integer) array[leftChild].iData > (Integer) array[rightChild].iData)
                    ) {
                largeChild = leftChild;
            } else {
                largeChild = rightChild;
            }
            if ((Integer) top.iData >= (Integer) array[largeChild].iData) {
                break;
            }
            array[index] = array[largeChild];
            index = largeChild;
        }
        array[index] = top;
    }

    /**
     * 修改堆中某一个元素值
     *
     * @param index
     * @param newVal
     * @return
     */
    public boolean modify(int index, int newVal) {
        if (index < 0 || index >= currentSize) {
            return false;
        }
        int oldVal = (Integer) array[index].iData;
        array[index].iData = newVal;
        if (oldVal < newVal) {
            tricleUp(index);
        } else {
            tricleDown(index);
        }
        return true;
    }

    /**
     * 显示堆数组内容
     */
    public void display() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(array[i].iData);
        }
    }
}
