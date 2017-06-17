package com.ds.stack;

import com.ds.helper.PrintStack;

import java.util.Stack;

/**
 * Created by anandkumar on 17/6/17.
 */
public class ReverseStack {

    public static Stack<Integer> reverse(Stack<Integer> stack) {
        if(stack.isEmpty() || stack.size() == 1){
            return stack;
        }
        int a = stack.pop();
        reverse(stack);
        insertAtBottom(a, stack);
        return stack ;
    }

    public static Stack<Integer> insertAtBottom(int item, Stack<Integer> stack){
        if(stack.isEmpty()) {
            stack.push(item);
            return stack;
        }

        int a = stack.pop();
        insertAtBottom(item,stack);
        stack.push(a);
        return stack ;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack = reverse(stack);
        System.out.println("stack after reversal");
        while(!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
