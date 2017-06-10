package com.ds.list;

import com.ds.dao.ListNode;
import com.ds.helper.LinkedListMaker;

/**
 * Created by anandkumar on 10/6/17.
 */
public class ArrangeEvenOddPositions {

    public static void arrange(ListNode head) {
        if(head == null){
            System.out.println("empty list");
            return ;
        }
        if(head.getNext() == null){
            System.out.println("single element list");
            return ;
        }
        if(head.getNext().getNext() == null){
            System.out.println("two elements list");
            return ;
        }

        ListNode currentEven = head.getNext();
        ListNode currentOdd = head ;
        ListNode headOfEvn = currentEven ;

        while(currentEven != null && currentEven.getNext() != null && currentOdd.getNext() != null){
            currentOdd.setNext(currentEven.getNext());
            currentOdd = currentOdd.getNext();
            if(currentEven.getNext()!=null) {
                currentEven.setNext(currentEven.getNext().getNext());
            }
            currentEven = currentEven.getNext();
        }

        currentOdd.setNext(headOfEvn);
    }
    public static void main(String[] args) {

        ListNode head = LinkedListMaker.makeList("1,2,3");
        arrange(head);
        ListTraversal.traverse(head);
    }
}
