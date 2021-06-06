package com.magic.linkedlist;

public class SortedLinkedList <E extends Comparable<E>>{
    public Node<E> head=null;

    public void add(E data){
        Node<E> newnode=new Node<>(data);
        if(head==null||head.getData().compareTo(newnode.getData())>0){
            newnode.next=head;
            head=newnode;
        }else{
            Node<E> temp=head;
            while(temp.next!=null && temp.next.data.compareTo(data)<0)
                temp=temp.next;
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
}
