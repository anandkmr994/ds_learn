package com.ds.list;


import com.ds.dao.BinaryTreeNode;
import com.ds.dao.DoublyListNode;

/**
 * Created by anandkumar on 8/7/17.
 */
public class CircularDLLTraversal {

    public static void traverseRight(BinaryTreeNode head) {
        if(head == null){
            System.out.println("empty list");
            return ;
        }
        BinaryTreeNode current =  head;

        do{
            if(current.getRight() != head) {
                System.out.print(current.getData() + " <=> ");
            }else{
                System.out.print(current.getData() );
            }
            current = current.getRight() ;
        }while (current!=head);
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
