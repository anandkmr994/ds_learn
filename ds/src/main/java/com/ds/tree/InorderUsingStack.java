package com.ds.tree;

import com.ds.dao.BinaryTreeNode;
import com.ds.dao.CustomStack;

/**
 * Created by anandkumar on 5/7/17.
 */

/*
Algorithm

1) Create an empty stack S.
2) Initialize current node as root
3) Push the current node to S and set current = current->left until current is NULL
4) If current is NULL and stack is not empty then
     a) Pop the top item from stack.
     b) Print the popped item, set current = popped_item->right
     c) Go to step 3.
5) If current is NULL and stack is empty then we are done.
 */
public class InorderUsingStack {
    public static void inorder(BinaryTreeNode root) {
        if(null == root){
            return ;
        }
        CustomStack<BinaryTreeNode> stack = new CustomStack<BinaryTreeNode>();
        BinaryTreeNode current = root ;
        while(current!=null){
            stack.push(current);
            current = current.getLeft() ;
        }

        while(!stack.isEmpty()) {
            current = stack.pop();
            System.out.print(current.getData()+" ");

            if (current.getRight() != null) {
                current = current.getRight();
                while (current != null) {
                    stack.push(current);
                    current = current.getLeft();
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.setRight(new BinaryTreeNode(3));
        root.getLeft().setLeft(new BinaryTreeNode(4));
        root.getLeft().setRight(new BinaryTreeNode(5));
        inorder(root);
    }
}
