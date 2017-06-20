package com.ds.stack;

import com.ds.dao.CustomStack;

/**
 * Created by anandkumar on 18/6/17.
 */
// program to find longest valid substring in string like "()((())"
public class LongestValidString {

    class Result{
        int result ;
        int start ;
        int end ;
    }
    public Result LVS(String string) {
        Result result = new Result();
        CustomStack<Integer> stack = new CustomStack<Integer>();
        stack.push(-1);
        for(int i = 0 ; i < string.length() ; i++){
            if(string.charAt(i) == '('){
                stack.push(i);
            }
            else if(string.charAt(i) == ')'){
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    result.result = i-stack.peek()>result.result?i-stack.peek() : result.result ;
                    result.start = stack.peek();
                    result.end = i ;
                }
            }
        }
        return result ;
    }
    public static void main(String[] args) {
        String string = "()(()))))";
        LongestValidString lvs = new LongestValidString();
        Result result = null ;
        result = lvs.LVS(string);
        System.out.println("longest valid substring for : " + string + " is : " +
                string.substring(result.start+1, result.end+1) + " with length : " + result.result);
    }
}
