package com.huawei.stack;

import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/14 08:07
 * @Description:
 */
public class StackDemo {
    @Test
    public void demo() {
        StackDemo stackDemo = new StackDemo();
        stackDemo.push('a');
        Object pop = stackDemo.pop();
        stackDemo.peek();
    }

    protected int elementCount;
    protected Object[] elementData;

    public StackDemo() {
        this(10);
    }

    public StackDemo(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    public Object peek() {
        if (elementCount == 0) {
            throw new RuntimeException("stack is empty");
        }
        return elementData[elementCount - 1];
    }

    public Object push(Object object) {
        if (elementCount >= elementData.length) {
            throw new RuntimeException("stack is full");
        }
        elementData[elementCount++] = object;
        return object;
    }

    public Object pop() {
        if (elementCount == 0) {
            throw new RuntimeException("stack is empty");
        }
        Object peek = peek();
        elementData[--elementCount] = null;
        return peek;
    }
}
