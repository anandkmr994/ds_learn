package com.ds.stack;

import java.util.Stack;

/**
 * Created by anandkumar on 17/6/17.
 */
public class NextGreaterElement {

    public static void NGE(int[] arr) {
        if(null == arr || arr.length == 0){
            System.out.println("empty array");
            return;
        }

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[0]);
        int next ;
        for(int i = 1; i<arr.length ; i++){
            next = arr[i];
            while(!stack.isEmpty() && stack.peek()< next){
                System.out.println(stack.pop() + " ===> " + next);
            }
            stack.push(next);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop() + " ===> " + -1);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{13,7,6,12};
        NGE(arr);
    }
}
