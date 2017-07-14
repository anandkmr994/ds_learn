package com.ds.tree;

import com.ds.dao.BinaryTreeNode;
import com.ds.list.CircularDLLTraversal;

/**
 * Created by anandkumar on 8/7/17.
 */
/*
Algorithm

1) Write a general purpose function that concatenates two given circular doubly lists (This function is explained below).
2) Now traverse the given tree
….a) Recursively convert left subtree to a circular DLL. Let the converted list be leftList.
….a) Recursively convert right subtree to a circular DLL. Let the converted list be rightList.
….c) Make a circular linked list of root of the tree, make left and right of root to point to itself.
….d) Concatenate leftList with list of single root node.
….e) Concatenate the list produced in step above (d) with rightList.
 */
public class TreeToCircularDLL {

    public static BinaryTreeNode concatenateCDllLists(BinaryTreeNode leftList, BinaryTreeNode rightList) {
        if(leftList==null)
            return rightList ;
        if(rightList==null)
            return leftList ;

        BinaryTreeNode leftLast = leftList.getLeft();
        BinaryTreeNode rightLast = rightList.getLeft();

        leftLast.setRight(rightList);
        rightList.setLeft(leftLast);

        leftList.setLeft(rightLast);
        rightLast.setRight(leftList);

        return leftList ;
    }

    public static BinaryTreeNode treeToCList(BinaryTreeNode root) {
        if(root==null)
            return root ;

        BinaryTreeNode left = treeToCList(root.getLeft());
        BinaryTreeNode right = treeToCList(root.getRight());

        root.setLeft(root);
        root.setRight(root);

        return concatenateCDllLists(concatenateCDllLists(left,root),right);
    }
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.setRight(new BinaryTreeNode(3));
        root.getLeft().setLeft(new BinaryTreeNode(4));
        root.getLeft().setRight(new BinaryTreeNode(5));
        CircularDLLTraversal.traverseRight(treeToCList(root));
    }
}
