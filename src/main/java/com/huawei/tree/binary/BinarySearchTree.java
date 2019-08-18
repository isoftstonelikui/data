package com.huawei.tree.binary;

import com.huawei.stack.StackDemo;

/**
 * @Auther: likui
 * @Date: 2019/8/18 09:45
 * @Description:
 */
public class BinarySearchTree {
    public Node root;

    //二叉搜索树的查找
    public Node find(int key) {
        if (root == null) {
            return null;
        }
        Node current = root;
        while ((Integer) current.iData != key) {
            if (key < (Integer) current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    //二叉搜索树插入一个节点
    public void insert(int key) {
        //构造节点
        Node node = new Node(key);
        //树为空
        if (root == null) {
            root = node;
            return;
        }
        //树不为空，找到要插入的节点
        Node current = root;
        Node parent = current;
        while (current != null) {
            parent = current;
            if (key < (Integer) current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        //判断插入在节点哪一侧
        if (key < (Integer) parent.iData) {
            parent.leftChild = node;
        } else {
            parent.rightChild = node;
        }
    }

    /**
     * 二叉树中序遍历：左子节点、自身、右子节点
     *
     * @param localNode
     */
    public void inorder(Node localNode) {
        if (localNode != null) {
            inorder(localNode.leftChild);
            localNode.display();
            inorder(localNode.rightChild);
        }
    }

    /**
     * 二叉树前序遍历：自身、左子节点、右子节点
     *
     * @param localNode
     */
    public void preorder(Node localNode) {
        if (localNode != null) {
            localNode.display();
            preorder(localNode.leftChild);
            preorder(localNode.rightChild);
        }
    }

    /**
     * 二叉树后序遍历：左子节点、右子节点、自身
     *
     * @param localNode
     */
    public void postorder(Node localNode) {
        if (localNode != null) {
            postorder(localNode.leftChild);
            postorder(localNode.rightChild);
            localNode.display();
        }
    }

    /**
     * 查找最小值
     *
     * @return Node
     */
    public Node getMin() {
        Node current = root;
        Node last = current;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    /**
     * 查找最大值
     *
     * @return Node
     */
    public Node getMax() {
        Node current = root;
        Node last = current;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    /**
     * 删除节点，实际删除比较复杂，有时可以直接将要删除节点置为false(显示已删除)
     *
     * @param key
     * @return boolean
     */
    public boolean deleteNode(int key) {
        if (root == null) {
            return false;
        }
        //找到要删除的节点
        Node current = root;
        Node parent = root;
        while ((Integer) current.iData != key) {
            parent = current;
            if (key < (Integer) current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            //找不到
            if (current == null) {
                return false;
            }
        }
        //找到了，删除
        //1、没有子节点
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else {
                if (parent.leftChild == current) {
                    parent.leftChild = null;
                }
                if (parent.rightChild == current) {
                    parent.rightChild = null;
                }
            }
            return true;
        }
        //2、有一个子节点
        if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            }
            if (parent.leftChild == current) {
                parent.leftChild = current.rightChild;
            }
            if (parent.rightChild == current) {
                parent.rightChild = current.rightChild;
            }
            return true;
        }
        if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            }
            if (parent.leftChild == current) {
                parent.leftChild = current.leftChild;
            }
            if (parent.rightChild == current) {
                parent.rightChild = current.leftChild;
            }
            return true;
        }
        //3、有两个子节点
        Node successor = getSuccessor(current);
        //3.1后继节点是当前节点右子节点
        if (current.rightChild == successor) {
            if (current == root) {
                root = successor;
            } else if (parent.rightChild == current) {
                parent.rightChild = successor;
            } else {
                parent.leftChild = successor;
            }
            successor.leftChild = current.leftChild;
            return true;
        }
        //3.2后继节点是当前节点右子节点的左子孙节点
        if (current == root) {
            root = successor;
            root.leftChild = current.leftChild;
        } else if(parent.rightChild==current){
            parent.rightChild = successor;
            successor.leftChild = current.leftChild;
        }else{
            parent.leftChild=successor;
            successor.leftChild = current.leftChild;
        }
        return true;
    }

    /**
     * 得到节点的后继节点
     *
     * @param delNode
     * @return Node
     */
    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != delNode.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    /**
     * 由后缀表达式转化成一颗二叉树
     *
     * @param expression
     * @return BinarySearchTree
     */
    public BinarySearchTree expression(String expression) {
        StackDemo stack = new StackDemo();
        char[] chars = expression.toCharArray();
        for (char aChar : chars) {
            if (isNumber(aChar)) {
                //是数字直接进栈
                BinarySearchTree tree = new BinarySearchTree();
                tree.root = new Node(aChar);
                stack.push(tree);
            } else {
                //不是数字先把前面两棵树出栈，再和操作符拼接成新数
                Object right = stack.pop();
                Object left = stack.pop();
                BinarySearchTree tree = new BinarySearchTree();
                tree.root = new Node(aChar);
                tree.root.leftChild = new Node(left);
                tree.root.rightChild = new Node(right);
                //新树入栈
                stack.push(tree);
            }
        }
        return (BinarySearchTree) stack.pop();
    }

    private boolean isNumber(char aChar) {
        int result = (int) aChar;
        if (result >= 48 && result <= 57) {
            return true;
        }
        return false;
    }

}
