package com.ds.list;

import com.ds.dao.ListNode;
import com.ds.helper.LinkedListMaker;

/**
 * Created by anandkumar on 5/6/17.
 */
public class ListIntersection {

    public static ListNode sortedIntersection(ListNode head1, ListNode head2) {
        if(head1 == null || head2 == null){
            System.out.println("either or both lists are empty");
            return null ;
        }
        ListNode head = null ;
        ListNode current = null;
        ListNode current1 = head1 , current2 = head2 ;
        int data = 0;
        while(current1 != null && current2 !=null){
            if(current1.getData()> current2.getData()){
                current2 = current2.getNext() ;
            }else if(current1.getData()<current2.getData()){
                current1 = current1.getNext() ;
            }else if (current1.getData() == current2.getData()){
                data = current1.getData() ;
                current1 = current1.getNext() ;
                current2 = current2.getNext() ;
                ListNode newNode = new ListNode(data);
                if(head == null){
                    head = newNode;
                    current = head ;
                }else{
                    current.setNext(newNode);
                    current = current.getNext() ;
                }
            }
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head1 = LinkedListMaker.makeList("1,2,3,4,6");
        ListNode head2 = LinkedListMaker.makeList("2,4,6,8");
        ListTraversal.traverse(sortedIntersection(head1, head2));
    }
}
