package com.ds.list;

import com.ds.dao.ListNode;
import com.ds.helper.LinkedListMaker;

/**
 * Created by anandkumar on 6/6/17.
 */
public class reverseKAlternate {

    public static ListNode reverseKAlternate(ListNode head, int k) {
        if(head == null){
            System.out.println("empty list");
            return head;
        }
        if(head.getNext() == null){
            System.out.println("single element list");
            return head ;
        }

        int count = 0;
        ListNode current = head ;
        ListNode next = null ;
        ListNode prev = null ;

        while(current!=null && count<k){
            next = current.getNext();
            current.setNext(prev);
            prev = current ;
            current = next ;
            count++;
        }
        count = 0 ;
        head.setNext(next) ;
        while(next!=null && count<k-1){
            next = next.getNext() ;
            count++;
        }
        if(next!=null){
            next.setNext(reverseKAlternate(next.getNext(),k));
        }
        return prev ;
    }
    public static void main(String[] args) {
        ListNode head = LinkedListMaker.makeList("");
        ListNode newHead = reverseKAlternate(head, 3);
        ListTraversal.traverse(newHead);
    }
}
