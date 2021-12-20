package com.blz.bst;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void givenNumbers_whenAddedToBST_shouldReturnSize() {
        MyBinaryTree myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        Assert.assertEquals(3,myBinaryTree.getSize());
    }

    @Test
    public void givenNumberArray_whenAddedInBST_shouldReturnSize() {
        MyBinaryTree myBinaryTree = new MyBinaryTree<>();
        int numberArray[] = {56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};
        for(int number:numberArray){
            myBinaryTree.add(number);
        }
        System.out.println(myBinaryTree.root);
        Assert.assertEquals(13, myBinaryTree.getSize());
    }

    @Test
    public void givenNumber_whenCheckIsPresent_shouldReturnTure() {
        MyBinaryTree myBinaryTree = new MyBinaryTree<>();
        int numberArray[] = {56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};
        for(int number:numberArray){
            myBinaryTree.add(number);
        }
        boolean actualResult=myBinaryTree.isPresent(63);
        boolean expectedResult=true;
        Assert.assertEquals( actualResult,expectedResult);
    }
}

