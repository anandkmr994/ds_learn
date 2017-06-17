package com.ds.helper;


import com.ds.dao.DoublyListNode;

/**
 * Created by anandkumar on 13/6/17.
 */
public class DLLMaker {

    public static DoublyListNode makeList(String commaSeparatedNumbers){
        if(commaSeparatedNumbers.isEmpty()){
            System.out.println("empty String, cant make list out of it");
            return null ;
        }
        String[] arr = commaSeparatedNumbers.split(",");
        DoublyListNode head = null;
        DoublyListNode current = null;
        for(String data : arr){
            DoublyListNode node = new DoublyListNode(Integer.parseInt(data));
            if(head == null){
                head = node;
                current = head ;
            }else{
                current.setNext(node);
                node.setPrev(current);
                current = current.getNext();
            }
        }
        return  head ;
    }
}
