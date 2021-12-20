package com.blz.bst;

public class MyBinaryTree<K extends Comparable> {


    public MyBinaryNode<K>root;
    public void add(K key) {
        this.root = this.addRecursively(root,key);

    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current== null)
        return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if(compareResult ==0)
            return current;
        else if (compareResult < 0)
            current.leftNode=addRecursively(current.leftNode,key);
        else{
            current.rightNode=addRecursively(current.rightNode,key);
        }
          return current;
    }

    public int getSize() {
        return  this.getRecursive(root);
    }

    private int getRecursive(MyBinaryNode<K> current) {
        return current==null ? 0 : 1 + this.getRecursive(current.leftNode) + this.getRecursive(current.rightNode);

    }
}
