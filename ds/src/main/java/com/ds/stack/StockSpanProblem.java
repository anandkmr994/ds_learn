package com.ds.stack;

import com.ds.dao.CustomStack;

import java.util.Stack;

/**
 * Created by anandkumar on 17/6/17.
 */
public class StockSpanProblem {
    public static void printSpan(int[] stockPriceArray) {
        if(null == stockPriceArray || stockPriceArray.length == 0)
            return ;
        CustomStack<Integer> stack = new CustomStack<Integer>();
        stack.push(0);
        System.out.println(1);
        for(int i = 1 ; i < stockPriceArray.length ; i++ ){
            while(!stack.isEmpty() && stockPriceArray[stack.peek()]<stockPriceArray[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                System.out.println(1);
            }else {
                System.out.println(i-stack.peek());
            }
            stack.push(i);
        }
    }
    public static void main(String[] args) {
        int[] stockPriceArray = new int[]{100, 80, 60, 70, 60, 75, 85};
        printSpan(stockPriceArray);
    }
}
