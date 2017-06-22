package com.ds.stack;

import com.ds.dao.CustomStack;

/**
 * Created by anandkumar on 20/6/17.
 */
//checks if an array can represent pre order traversal of a BST
public class PreorderTreeRepresent {
    public static boolean canRepresentPre(int[] pre) {
        CustomStack<Integer> stack = new CustomStack<Integer>();

        int root = Integer.MIN_VALUE ;

        for(int i = 0 ; i < pre.length ; i++){
            if(pre[i]<root)
                return false ;
            while(!stack.isEmpty() && stack.peek()<pre[i]) {
                root = stack.pop();
            }
            stack.push(pre[i]);
        }
        return true ;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,1};
        System.out.println(canRepresentPre(arr));
    }
}
