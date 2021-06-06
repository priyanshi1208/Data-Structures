package com.magic.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void validating_if_linkedlist_can_push_from_front() {
       LinkedList<Integer> list=new LinkedList<>();
       list.push(30);
       boolean  result = list.head.getData().equals(30);
        Assert.assertTrue(result);
    }
    @Test
    public void validating_if_linkedlist_can_push_from_back() {
        LinkedList<Integer> list=new LinkedList<>();
        list.push(30);
        list.append(20);
        list.append(10);
        boolean  result = list.head.getData().equals(30)&&list.head.getNext().getData().equals(20)&&list.head.getNext().getNext().getData().equals(10);
        Assert.assertTrue(result);
    }
}