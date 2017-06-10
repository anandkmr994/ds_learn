package com.ds.list;

import com.ds.dao.ListNode;
import com.ds.helper.LinkedListMaker;

/**
 * Created by anandkumar on 7/6/17.
 */
public class InsertAlternate {

    public static ListNode insertAlternate(ListNode head1, ListNode head2) {
        if(head1 == null){
            System.out.println("first list is empty, returning 2nd as result");
            return head2 ;
        }
        if(head2 == null){
            System.out.println("second list is empty, returning 1st as result");
            return head1 ;
        }
        ListNode current1 = head1, current2 = head2, current= current1;
        ListNode next1 = null , next2 = null, temp = null;
        while(current1 !=null && current2 != null){
            next1 = current1.getNext();
            next2 = current2.getNext();
            current1.setNext(current2);
            if(next1!=null) {
                current2.setNext(next1);
            }
            current = current.getNext().getNext();
            current1 = next1;
            current2 = next2;
        }

        if(current1 == null){
            current = current2;
        }
        if(current2 == null){
            current = current1;
        }
        return head1 ;
    }
    public static void main(String[] args) {
        ListNode head1 = LinkedListMaker.makeList("5,7,3,4,5");
        ListNode head2 = LinkedListMaker.makeList("12,10,2,6,7,8,9");
        ListNode result = insertAlternate(head1,head2);
        ListTraversal.traverse(result);
    }
}
