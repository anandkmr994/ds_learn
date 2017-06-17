package com.ds.list;

import com.ds.dao.DoublyListNode;
import com.ds.helper.DLLMaker;

/**
 * Created by anandkumar on 13/6/17.
 */
public class ReverseDLL {

    public static DoublyListNode reverse(DoublyListNode head) {
        if(head == null){
            System.out.println("empty list");
            return head ;
        }
        if(head.getNext() == null){
            System.out.println("single element list");
            return head ;
        }

        DoublyListNode current = head ;
        DoublyListNode prev = null ;

        while(current != null){
            prev = current.getPrev();
            current.setPrev(current.getNext());
            current.setNext(prev);
            current = current.getPrev();
        }

        return prev.getPrev();
    }
    public static void main(String[] args) {
        DoublyListNode head = DLLMaker.makeList("");
        DLLTraversal.traverseRight(head);
        System.out.println();
        System.out.println("list after reversal");
        DLLTraversal.traverseRight(reverse(head));

    }
}
