package com.ds.tree;

import com.ds.dao.BinaryTreeNode;

/**
 * Created by anandkumar on 5/7/17.
 */

/*
Algorithm
1. Initialize current as root
2. While current is not NULL
   If current does not have left child
      a) Print current’s data
      b) Go to the right, i.e., current = current->right
   Else
      a) Make current as right child of the rightmost
         node in current's left subtree
      b) Go to this left child, i.e., current = current->left
 */
public class InorderMorrisTraversal {
    public static void morrisTraversal(BinaryTreeNode root) {
        if(root == null){
            System.out.println("empty tree");
            return ;
        }
        BinaryTreeNode current = root ;
        BinaryTreeNode predecessor ;
        while(current!=null){
            if(current.getLeft() == null){
                System.out.print(current.getData() + " ");
                current = current.getRight();
            }
            else{
                predecessor = current.getLeft();
                while(predecessor.getRight()!=null && predecessor.getRight()!=current){
                    predecessor = predecessor.getRight();
                }
                if(predecessor.getRight() == null){
                    predecessor.setRight(current);
                    current = current.getLeft();
                }else{
                    predecessor.setRight(null);
                    System.out.print(current.getData() + " ");
                    current = current.getRight();
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
        morrisTraversal(root);
    }
}
