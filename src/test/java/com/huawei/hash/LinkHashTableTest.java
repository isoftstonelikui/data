package com.huawei.hash;

import com.huawei.link.SingleLink;
import org.junit.Before;
import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/21 12:23
 * @Description:
 */
public class LinkHashTableTest {

    private LinkHashTable hashTable = new LinkHashTable(5);

    @Before
    public void initialize() {
        hashTable.insert(new SingleLink(3, null));
        hashTable.insert(new SingleLink(2, null));
        hashTable.insert(new SingleLink(7, null));
    }

    @Test
    public void testFind() {
        SingleLink link = hashTable.find(7);
    }

    @Test
    public void testDelete(){
        hashTable.delete(2);
    }
}
