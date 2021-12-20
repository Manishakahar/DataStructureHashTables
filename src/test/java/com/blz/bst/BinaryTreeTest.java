package com.blz.bst;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void givenNumbers_whenAddedToBST_shouldReturnSize() {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);

        Assert.assertEquals(3,myBinaryTree.getSize());
    }
}
