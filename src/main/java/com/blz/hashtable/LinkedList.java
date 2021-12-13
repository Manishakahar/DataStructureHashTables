package com.blz.hashtable;

public class LinkedList<K> {
    public INode<K> head;
    public INode tail;

    public INode<K> search(K key) {
        INode tempNode = head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void append(INode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    public INode<K> delete(K key) {
        INode temp=head;
        if (temp==null){
            return null;
        }
        while (temp.getNext()!=null)
        {
            if (temp.getNext().getKey().equals(key)){
                INode m=temp.getNext().getNext();
                temp.setNext(m);
            }
            temp=temp.getNext();
        }
        return  temp;
    }
}
