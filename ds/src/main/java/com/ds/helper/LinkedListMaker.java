package com.ds.helper;

import com.ds.dao.ListNode;
import com.ds.list.ListTraversal;

import java.util.Arrays;
import java.util.List;

/**
 * Created by anandkumar on 2/6/17.
 */
public class LinkedListMaker {

    public static ListNode makeList(String commaSeparatedNumbers){
        String[] arr = commaSeparatedNumbers.split(",");
        ListNode head = null;
        ListNode current = null;
        for(String data : arr){
            ListNode node = new ListNode(Integer.parseInt(data));
            if(head == null){
                head = node;
                current = head ;
            }else{
                current.setNext(node);
                current = current.getNext();
            }
        }
        return  head ;
    }
}
