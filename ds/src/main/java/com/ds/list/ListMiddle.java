package com.ds.list;

import com.ds.dao.ListNode;
import com.ds.helper.LinkedListMaker;

/**
 * Created by anandkumar on 3/6/17.
 */
public class ListMiddle {


    public static void findMiddle(ListNode head) {
        if(head == null){
            System.out.println("empty list");
            return ;
        }
        if(head.getNext() == null){
            System.out.println("head is middle node , middle node: " + head.getData());
            return ;
        }
        ListNode slow = head ;
        ListNode fast = head ;

        while(fast!= null && fast.getNext() !=null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        System.out.println("middle node : " + slow.getData());
    }
    public static void main(String[] args) {
        ListNode head = LinkedListMaker.makeList("3,4,5");
        findMiddle(head);
    }
}
