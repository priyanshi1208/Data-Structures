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
    @Test
    public void validating_if_linkedlist_can_push_in_between() {
        LinkedList<Integer> list=new LinkedList<>();
        list.push(30);
        list.append(10);
        list.insertAtBetween(20,30);
        boolean  result = list.head.getData().equals(30)&&list.head.getNext().getData().equals(20)&&list.head.getNext().getNext().getData().equals(10);
        Assert.assertTrue(result);
    }
    @Test
    public void validating_if_linkedlist_can_pop_from_start() {
        LinkedList<Integer> list=new LinkedList<>();
        list.push(30);
        list.append(10);
        list.insertAtBetween(20,30);
        list.pop();
        boolean  result = list.head.getData().equals(20)&&list.head.getNext().getData().equals(10);
        Assert.assertTrue(result);
    }
    @Test
    public void validating_if_linkedlist_can_pop_from_last() {
        LinkedList<Integer> list=new LinkedList<>();
        list.push(30);
        list.append(10);
        list.insertAtBetween(20,30);
        list.deleteValue(10);
        boolean  result = list.head.getData().equals(30)&&list.head.getNext().getData().equals(20);
        Assert.assertTrue(result);
    }
    @Test
    public void validating_if_linkedlist_can_pop_from_between() {
        LinkedList<Integer> list=new LinkedList<>();
        list.push(30);
        list.append(10);
        list.insertAtBetween(20,30);
        list.deleteValue(20);
        boolean  result = list.head.getData().equals(30)&&list.head.getNext().getData().equals(10);
        Assert.assertTrue(result);
    }
    @Test
    public void validating_if_linkedlist_can_add_in_sorted_way() {
        SortedLinkedList<Integer> list=new SortedLinkedList<>();
        list.add(20);
        list.add(10);
        list.add(30);
        boolean  result = list.head.getData().equals(10)&&list.head.getNext().getData().equals(20)&&list.head.getNext().getNext().data.equals(30);
        Assert.assertTrue(result);
    }

}