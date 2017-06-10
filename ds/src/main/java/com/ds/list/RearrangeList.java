package com.ds.list;

import com.ds.dao.ListNode;
import com.ds.helper.LinkedListMaker;

/**
 * Created by anandkumar on 8/6/17.
 */
//this program arranges the given list as below
    //list :  1->2->3->4->5
    //result : 1->5->2->4->3
public class RearrangeList {

    public static void rearrange(ListNode head) {
        if(head == null){
            System.out.println("empty list");
            return ;
        }
        if(head.getNext()==null || head.getNext().getNext()==null){
            System.out.println("not enough elements in the list");
            return ;
        }
        ListNode middle = MergeSort.findMiddle(head);
        System.out.println("middle node : " + middle.getData());
        ListNode head1 = head , head2 = ListReversal.reverse(middle) ;
        ListTraversal.traverse(head1);
        System.out.println();
        ListTraversal.traverse(head2);
        System.out.println();
        InsertAlternate.insertAlternate(head1, head2);
    }
    public static void main(String[] args) {
        ListNode head = LinkedListMaker.makeList("1,2,3,4,5");
        rearrange(head);
        ListTraversal.traverse(head);
    }
}
