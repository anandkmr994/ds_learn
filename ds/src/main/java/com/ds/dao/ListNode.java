package com.ds.dao;

/**
 * Created by anandkumar on 2/6/17.
 */
public class ListNode {
    private int data ;
    private ListNode next ;

    public ListNode(int data, ListNode next){
        this.data = data;
        this.next = next ;
    }

    public ListNode(int data){
        this.data = data;
        this.next = null ;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
