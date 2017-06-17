package com.ds.list;

import com.ds.dao.DoublyListNode;

/**
 * Created by anandkumar on 13/6/17.
 */
public class DLLTraversal {

    public static void traverseRight(DoublyListNode head) {
        if(head == null){
            System.out.println("empty list");
            return ;
        }
        DoublyListNode current = head ;
        while(current != null){
            if(current.getNext() != null) {
                System.out.print(current.getData() + " <=> ");
            }else{
                System.out.print(current.getData() );
            }
            current = current.getNext() ;
        }
    }

    public static void traverseLeft(DoublyListNode head) {
        if(head == null){
            System.out.println("empty list");
            return ;
        }

        DoublyListNode current = head ;

        while(current.getNext() != null){
            current = current.getNext();
        }

        while(current != null){
            if(current.getPrev() != null) {
                System.out.print(current.getData() + " <=> ");
            }else{
                System.out.print(current.getData() );
            }
            current = current.getPrev() ;
        }
    }
}
