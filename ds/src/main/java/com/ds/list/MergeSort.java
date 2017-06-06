package com.ds.list;

import com.ds.dao.ListNode;
import com.ds.helper.LinkedListMaker;

/**
 * Created by anandkumar on 5/6/17.
 */
public class MergeSort {
    public static ListNode mergeSort(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.getNext() == null){
            return head;
        }
        ListNode sortedHead = null, sortedMid = null ;
        ListNode mid = findMiddle(head) ;
        System.out.println("going to sort following two list");
        ListTraversal.traverse(head);
        System.out.println();
        ListTraversal.traverse(mid);
        System.out.println();
        sortedHead = mergeSort(head);
        sortedMid = mergeSort(mid);
        return MergeSortedList.sortedMerge(sortedHead,sortedMid);
    }

    public static ListNode findMiddle(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.getNext() == null){
            return head;
        }
        ListNode slow = head ;
        ListNode fast = head ;
        ListNode prev = null ;

        while(fast!= null && fast.getNext() !=null){
            fast = fast.getNext().getNext();
            prev = slow ;
            slow = slow.getNext();
        }
        prev.setNext(null);
        return slow ;
    }


    public static void main(String[] args) {
        ListNode head = LinkedListMaker.makeList("11,3,2,6,19,21,11");
        ListNode newHead = mergeSort(head);
        ListTraversal.traverse(newHead);
    }
}
