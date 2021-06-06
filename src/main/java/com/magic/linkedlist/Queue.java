package com.magic.linkedlist;
public class Queue<E> {
    int rear,front;
    LinkedList<E> list=new LinkedList<>();
    public Queue() {
        front=rear=-1;
    }
    public void enqueue(E data){
        if(front==-1 && rear==-1) {
            list.append(data);
            front=rear=0;
        }
        else if(front==0 && rear!=-1){
            list.append(data);
            rear++;
        }

    }
    public void dequeue(){

        if(front!=rear+1) {
            list.pop();
            front=front+1;

        }
        else if(front==rear+1)
            System.out.println("Queue if popped out");


    }
    public void printQueue(){
        list.printList();
    }
    
}
