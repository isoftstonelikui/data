package com.huawei.tree.binary;

import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/19 12:19
 * @Description:
 */
public class HuffmanTreeTest {
    public HuffmanTree tree = new HuffmanTree();

    @Test
    public void testGetTree() {
        int[] treeData = {1, 1, 1, 2, 2, 2, 3, 4, 6};
        BinarySearchTree tree = this.tree.getTree(treeData);
    }
}
