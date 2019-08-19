package com.huawei.queue;

import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/14 20:49
 * @Description:
 */
public class QueueTest {
    @Test
    public void demo1() {
        PriorityQueueDemo priorityQueue=new PriorityQueueDemo(6);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(5);
        priorityQueue.add(8);
        priorityQueue.add(12);
        priorityQueue.add(4);
        //
        priorityQueue.remove();

    }
}
