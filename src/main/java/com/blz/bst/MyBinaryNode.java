package com.blz.bst;

public class MyBinaryNode<K> {
    K key;
    public MyBinaryNode<K> leftNode;
    public MyBinaryNode<K> rightNode;

    public MyBinaryNode(K key) {
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }
}
