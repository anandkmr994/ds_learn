package com.ds.dao;

/**
 * Created by anandkumar on 13/6/17.
 */
public class DoublyListNode {
    private int data ;
    private DoublyListNode next ;
    private DoublyListNode prev ;

    public DoublyListNode(int data){
        this.data = data ;
        this.next = null ;
        this.prev = null ;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyListNode getNext() {
        return next;
    }

    public void setNext(DoublyListNode next) {
        this.next = next;
    }

    public DoublyListNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyListNode prev) {
        this.prev = prev;
    }
}
