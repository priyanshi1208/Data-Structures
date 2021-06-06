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
    public void pop(){
        if(head==null)
            System.out.println("The list is empty");
        else{
            Node<E> temp=head;
            head=temp.next;
        }
    }
    public void deleteValue(E delete){
        Node<E> temp=head,prev=null;
        if(temp.getData() ==delete){
            head=temp.next;
            return;
        }
        while(temp!=null && temp.getData() !=delete){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null)
            return;
        prev.next=temp.next;
    }
    public void search(E searchData){
        Node<E> temp=head;
        int count=0;
        while(temp!=null){
            count++;
            if(temp.getData() ==searchData){
                System.out.println("Element found at position:"+count);
                return;
            }
            temp=temp.next;
        }
        if(temp==null)
            System.out.println("Element not found in the list");
    }
}
