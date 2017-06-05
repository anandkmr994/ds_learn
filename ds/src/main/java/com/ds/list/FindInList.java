package com.ds.list;

import com.ds.dao.ListNode;
import com.ds.helper.LinkedListMaker;

/**
 * Created by anandkumar on 2/6/17.
 */
public class FindInList {

    public static void findElement(ListNode head, int element){
        if(head == null){
            System.out.println("returning as the list is empty");
        }
        ListNode current = head ;
        int position = 0 ;
        while(current != null){
            position++;
            if(current.getData() == element){
                System.out.println(element + " found at position : " + position);
                return ;
            }
            current = current.getNext();
        }
        System.out.println(element + " is not present in the list");
    }

    public static void main(String[] args) {
        ListNode head = LinkedListMaker.makeList("2,3,4,5,6,7");
        findElement(head, 3);
    }
}
