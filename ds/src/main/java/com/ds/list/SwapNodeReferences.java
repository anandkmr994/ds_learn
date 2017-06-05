package com.ds.list;

import com.ds.dao.ListNode;
import com.ds.helper.LinkedListMaker;

/**
 * Created by anandkumar on 2/6/17.
 */
public class SwapNodeReferences {

    public static ListNode swapNodes(ListNode head, int x, int y){
        if(head == null){
            System.out.println("returning as the list is empty");
            return head;
        }
        if(x == y){
            System.out.println("elements to be swapped are same");
            return head;
        }
        ListNode prevX = null ;
        ListNode prevY = null ;
        ListNode currX = head;
        ListNode currY = head ;

        while(currX != null && currX.getData() != x){
            prevX = currX ;
            currX = currX.getNext();
        }

        while(currY != null && currY.getData() != y){
            prevY = currY ;
            currY = currY.getNext();
        }

        if(currX == null){
            System.out.println(x + " is not present in the list");
            return head ;
        }

        if(currY == null){
            System.out.println(y + " is not present in the list");
            return  head ;
        }

        if(prevX != null)
            prevX.setNext(currY) ;
        else
            head = currY ;


        if(prevY != null)
            prevY.setNext(currX) ;
        else
            head = currX ;

        ListNode temp = currX.getNext();
        currX.setNext(currY.getNext());
        currY.setNext(temp);

        return head ;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListMaker.makeList("2,3,4,5,6,7");
        head = swapNodes(head, 5, 6);
        System.out.println("list after swapping  " + 5 + " and " + 6);
        ListTraversal.traverse(head);
    }
}
