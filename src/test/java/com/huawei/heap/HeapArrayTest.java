package com.huawei.heap;

import org.junit.Before;
import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/22 21:40
 * @Description:
 */
public class HeapArrayTest {
    private HeapArray heapArray = new HeapArray();

    @Before
    public void initialize() {
        heapArray.insert(90);
        heapArray.insert(60);
        heapArray.insert(80);
        heapArray.insert(40);
        heapArray.insert(50);
        heapArray.insert(70);
        heapArray.insert(30);
    }

    @Test
    public void testInsert() {
        heapArray.insert(75);
    }

    @Test
    public void testRemove() {
        heapArray.remove();
    }

    @Test
    public void testModify() {
        heapArray.modify(1, 28);
    }

    @Test
    public void testDisplay() {
        heapArray.display();
    }
}
