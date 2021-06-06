package com.magic.linkedlist;

public class LinkedList<E> {
    Node<E> head;
    public void push(E data){
        Node<E> newNode= new Node<>(data);
        newNode.next=head;
        head=newNode;
    }
    public void append(E data){
        Node<E> lastNode=new Node<>(data);
        if(head==null)
            head=lastNode;
        else{
            Node<E> temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=lastNode;
        }
    }
    public void insertAtBetween(E data,E dataAfter){
        Node<E> nodeAtBetween=new Node<>(data);
        Node<E> temp=head;
        while(temp!=null){
            if(temp.getData() ==dataAfter){
                nodeAtBetween.next=temp.next;
                temp.next=nodeAtBetween;
                return;
            }
            temp=temp.next;
        }
    }
}
