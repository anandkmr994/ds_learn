package com.ds.list;

import com.ds.dao.ListNode;
import com.ds.helper.LinkedListMaker;

/**
 * Created by anandkumar on 2/6/17.
 */
public class ListTraversal {

    public static void traverse(ListNode head){
        if(head == null){
            System.out.println("returning as the list is empty");
        }
        ListNode current = head ;
        while(current != null){
            if(current.getNext() == null)
                System.out.print(current.getData());
            else
                System.out.print(current.getData() + " => ");
            current = current.getNext();
        }
    }

    public static void main(String[] args) {
        ListNode head = LinkedListMaker.makeList("2,3,4,5,6,7");
        traverse(head);
    }
}
