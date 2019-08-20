package com.huawei.hash;

import org.junit.Before;
import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/20 21:18
 * @Description:
 */
public class LinearHashTableTest {

    LinearHashTable table = new LinearHashTable(5);

    @Before
    public void initialize() {
        table.insert(2);
        table.insert(4);
        table.insert(7);
        table.insert(3);
    }

    @Test
    public void testFind() {
        DataItem dataItem = table.find(3);
    }

    @Test
    public void testDelete() {
        DataItem delete = table.delete(3);
    }

    @Test
    public void testDisplay() {
        table.display();
    }
}
