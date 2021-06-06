package com.magic.linkedlist;

public class Stack<E> {
    LinkedList<E> list=new LinkedList<>();
    int top;

    public Stack() {
        this.top = -1;
    }
    boolean isEmpty(){
        return top<0;
    }
    public void push(E x){
        list.push(x);
        top++;
    }
    public void pop(){
        list.pop();
        top--;
    }
    public int peek(){
        return top;
    }
    public void printStack(){
        list.printList();
    }
}