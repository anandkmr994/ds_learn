package com.ds.list;

import com.ds.dao.ListNode;
import com.ds.helper.LinkedListMaker;

/**
 * Created by anandkumar on 3/6/17.
 */
public class ListReversal {

    public static ListNode reverse(ListNode head) {
        if(head == null){
            System.out.println("empty tree");
            return head;
        }
        if(head.getNext() == null){
            System.out.println("only one element in the tree");
            return head;
        }

        ListNode current = head ;
        ListNode previous = null ;
        ListNode temp = null ;
        while(current!=null){
            temp = current.getNext() ;
            current.setNext(previous);
            previous = current ;
            current = temp ;
        }
        return previous;
    }
    public static void main(String[] args) {
        ListNode head = LinkedListMaker.makeList("3,4,5,6,7");
        head = reverse(head);
        ListTraversal.traverse(head);
    }
}
