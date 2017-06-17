package com.ds.helper;

import java.util.Stack;

/**
 * Created by anandkumar on 17/6/17.
 */
public class PrintStack {
    public static void print(Stack<Object> stack) {
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
