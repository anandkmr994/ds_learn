/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ds.dao;

import java.util.ArrayList;

/**
 *
 * @author anandkumar
 */
public class CustomQueue<T> {
    private ArrayList<T> arrayOfElements = new ArrayList<T>();
    private int size = 0;
    private int rear = 0;
    private int front = 0;
    
    public void enqueue(T item){
        arrayOfElements.add(item);
        rear++;
        size++;
    }

    public T dequeue(){
        T element ;
        if(size <= 0){
            System.out.println("queue underflow");
            throw new RuntimeException("queue underflow");
        }
        element = arrayOfElements.remove(front);
        size--;
        front++;
        return element;
    }

    public T front(){
        return arrayOfElements.get(front);
    }
    
    
    public T rear(){
        return arrayOfElements.get(rear-1);
    }

    public boolean isEmpty(){
        return size<=0;
    }
}
