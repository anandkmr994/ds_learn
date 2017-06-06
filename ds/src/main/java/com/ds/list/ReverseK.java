package com.ds.list;

import com.ds.dao.ListNode;
import com.ds.helper.LinkedListMaker;

/**
 * Created by anandkumar on 6/6/17.
 */
public class ReverseK {

    public static ListNode reverseK(ListNode head, int k) {
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
        if(next!=null){
            head.setNext(reverseK(next,k));
        }
        return prev ;
    }
    public static void main(String[] args) {
        ListNode head = LinkedListMaker.makeList("1,2,3,4,5,6,7,8,9,10");
        ListNode newHead = reverseK(head, 3);
        ListTraversal.traverse(newHead);
    }
}
