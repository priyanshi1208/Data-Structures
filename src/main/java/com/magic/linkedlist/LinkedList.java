package com.magic.linkedlist;

public class LinkedList<E> {
    Node<E> head;
    public void push(E data){
        Node<E> newNode= new Node<>(data);
        newNode.next=head;
        head=newNode;
    }
}
