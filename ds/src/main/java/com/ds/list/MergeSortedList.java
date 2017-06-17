package com.ds.list;

import com.ds.dao.ListNode;
import com.ds.helper.LinkedListMaker;

/**
 * Created by anandkumar on 5/6/17.
 */
public class MergeSortedList {

    public static ListNode sortedMerge(ListNode head1 , ListNode head2) {
        ListNode head = null , current = null;
        ListNode current1 = head1,current2 = head2 ;
        ListNode temp = null ;
        while(current1 != null && current2 != null){
            if(current1.getData()>=current2.getData()) {
                temp = current2;
                current2 = current2.getNext();
            }else if(current1.getData()<current2.getData()) {
                temp = current1;
                current1 = current1.getNext();
            }
            if(head == null){
                  head = temp ;
                  current = temp ;
            }else{
                current.setNext(temp);
                current = current.getNext() ;
            }
        }
        if(current1 == null){
            current.setNext(current2);
        }
        if(current2 == null){
            current.setNext(current1);
        }

        return head ;
    }

    public static void main(String[] args) {
        ListNode head1 = LinkedListMaker.makeList("1,3");
        ListNode head2 = LinkedListMaker.makeList("2");
        ListNode head = sortedMerge(head1, head2);
        ListTraversal.traverse(head);
    }
}
