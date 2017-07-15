package com.ds.tree;

import com.ds.dao.BinaryTreeNode;
import com.ds.dao.CustomQueue;

/**
 * Created by anandkumar on 15/7/17.
 */
/*
check if tree is complete binary tree or not

A complete binary tree is a binary tree in which every level, except possibly the last,
is completely filled, and all nodes are as far left as possible


example

    1
  /   \
 2     3

       1
    /    \
   2       3
  /
 4
 */
public class CompleteBinaryTreeCheck {
    public static boolean isComplete(BinaryTreeNode root) {
        if(root == null){
            return true ;
        }
        CustomQueue<BinaryTreeNode> queue = new CustomQueue<BinaryTreeNode>();
        queue.enqueue(root);
        BinaryTreeNode currentNode = null ;
        boolean notFullFound = false ;
        while(!queue.isEmpty()){
            currentNode = queue.dequeue();
            if(currentNode.getLeft()!=null){
                if(notFullFound)
                    return false ;
                queue.enqueue(currentNode.getLeft());
            }else{
                notFullFound = true ;
            }
            if(currentNode.getRight()!=null){
                if(notFullFound)
                    return false ;
                queue.enqueue(currentNode.getRight());
            }else{
                notFullFound = true ;
            }

        }
        return true ;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.setRight(new BinaryTreeNode(3));
        root.getRight().setLeft(new BinaryTreeNode(4));
        root.getRight().setRight(new BinaryTreeNode(5));
        System.out.println("is complete : " + isComplete(root));
    }
}
