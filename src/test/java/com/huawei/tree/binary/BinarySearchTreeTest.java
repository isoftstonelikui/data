package com.huawei.tree.binary;

import org.junit.Before;
import org.junit.Test;

/**
 * @Auther: likui
 * @Date: 2019/8/18 10:07
 * @Description:
 */
public class BinarySearchTreeTest {
    BinarySearchTree tree = new BinarySearchTree();

    @Before
    public void initialize() {
        Node root = new Node(60);
        Node node1 = new Node(40);
        Node node2 = new Node(30);
        Node node3 = new Node(50);
        Node node4 = new Node(45);
        root.leftChild = node1;
        node1.leftChild = node2;
        node1.rightChild = node3;
        node3.leftChild = node4;
        //
        tree.root = root;
    }

    @Test
    public void testFind() {
        Node node = tree.find(80);
        Node node1 = tree.find(40);
        Node node2 = tree.find(45);
    }

    @Test
    public void testInsert() {
        tree.insert(45);
    }

    @Test
    public void testInorder() {
        tree.inorder(tree.root);
    }

    @Test
    public void testPreorder() {
        tree.preorder(tree.root);
    }

    @Test
    public void testPostorder() {
        tree.postorder(tree.root);
    }

    @Test
    public void testExpression() {
        //BinarySearchTree expression = tree.expression("931-3*+52/+");
        BinarySearchTree expression = tree.expression("123+*");
    }

    @Test
    public void testDeleteNode() {
        boolean result = tree.deleteNode(40);
    }
}
