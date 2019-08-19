package com.huawei.tree.binary;

import com.huawei.sort.QuickSort;

import java.util.PriorityQueue;


/**
 * @Auther: likui
 * @Date: 2019/8/19 08:19
 * @Description: 哈夫曼树
 */
public class HuffmanTree {

    public BinarySearchTree getTree(int[] treeData) {
        //数据排序
        PriorityQueue<BinarySearchTree> queue = new PriorityQueue();
        //数据插入优先级队列
        for (int treeDatum : treeData) {
            BinarySearchTree tree = new BinarySearchTree();
            tree.root = new Node(treeDatum);
            queue.add(tree);
        }
        //构造哈夫曼树
        while (queue.size() != 1) {
            BinarySearchTree poll = queue.poll();
            BinarySearchTree poll1 = queue.poll();
            BinarySearchTree newTree = new BinarySearchTree();
            newTree.root = new Node((Integer) poll.root.iData + (Integer) poll1.root.iData);
            newTree.root.leftChild = poll.root;
            newTree.root.rightChild = poll1.root;
            queue.add(newTree);
        }
        return queue.poll();
    }
}
