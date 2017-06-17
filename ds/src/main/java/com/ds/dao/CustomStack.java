package com.ds.dao;

import java.util.ArrayList;

/**
 * Created by anandkumar on 17/6/17.
 */
public class CustomStack<T> {
    private ArrayList<T> arrayOfElements = new ArrayList<T>();
    private int top = 0;
    private int size = 0;

    public void push(T item){
        arrayOfElements.add(item);
        top++;
        size++;
    }

    public T pop(){
        T element ;
        if(size <= 0){
            System.out.println("stack underflow");
            new RuntimeException("stack underflow");
        }
        element = arrayOfElements.get(top);
        size--;
        top--;
        return element;
    }

    public boolean isEmpty(){
        if(size<=0)
            return true;
        return false;
    }
}
