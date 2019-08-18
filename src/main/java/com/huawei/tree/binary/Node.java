package com.huawei.tree.binary;

/**
 * @Auther: likui
 * @Date: 2019/8/18 09:27
 * @Description: 二叉树的节点
 */
public class Node {
    public Object iData;
    public Node leftChild;
    public Node rightChild;

    public Node(Object iData) {
        this.iData = iData;
    }

    public void display() {
        System.out.println("iData:" + iData);
    }
}
