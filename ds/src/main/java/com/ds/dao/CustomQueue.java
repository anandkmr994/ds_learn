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
        element = arrayOfElements.remove(0);
        size--;
        rear--;
        return element;
    }
    
    public T dequeueRear(){
    	T element ;
        if(size <= 0){
            System.out.println("queue underflow");
            throw new RuntimeException("queue underflow");
        }
        element = arrayOfElements.remove(rear-1);
        size--;
        rear--;
        return element;
    }
    
    public void enqueueFront(T item){
   		arrayOfElements.add(0, item);
   		rear++;
        size++;
    }

    public T front(){
        return arrayOfElements.get(0);
    }
    
    
    public T rear(){
        return arrayOfElements.get(rear-1);
    }

    public boolean isEmpty(){
        return size<=0;
    }
    
    
    //for testing the queue functioning
    public static void main(String[] args) {
		CustomQueue<Integer> queue = new CustomQueue<Integer>();
		System.out.println("is empty : " + queue.isEmpty());
		queue.enqueue(1);
		queue.enqueueFront(2);
		System.out.println("front : " + queue.front());
		System.out.println("rear : " + queue.rear());
		System.out.println("size : " + queue.size);
        System.out.println("get front : " + queue.front());
        queue.dequeue();
        System.out.println("removed front");
        System.out.println("get front : " + queue.front());
        System.out.println("rear index : " + queue.rear);
        System.out.println("get rear : " + queue.rear());
    }
}
