package com.ds.tree;

import com.ds.dao.BinaryTreeNode;

/**
 * Created by anandkumar on 5/7/17.
 */
/*
Algorith
initialize: pathlen = 0, path[1000]
1000 is some max limit for paths, it can change

*******printPathsRecur traverses nodes of tree in preorder**********8
printPathsRecur(tree, path[], pathlen)
        1) If node is not NULL then
        a) push data to path array:
        path[pathlen] = node->data.
        b) increment pathlen
        pathlen++
        2) If node is a leaf node then print the path array.
        3) Else
        a) Call printPathsRecur for left subtree
        printPathsRecur(node->left, path, pathLen)
        b) Call printPathsRecur for right subtree.
        printPathsRecur(node->right, path, pathLen)
 */
public class PrintPathsRootToLeaf {
    public static void printPaths(BinaryTreeNode root, int[] pathArray, int pathLength) {
        if(root == null){
            return ;
        }
        pathArray[pathLength] = root.getData();
        pathLength++;

        if(root.getRight()==null && root.getLeft() ==null){
            printArray(pathArray,pathLength);
        }

        printPaths(root.getLeft(),pathArray,pathLength);
        printPaths(root.getRight(),pathArray,pathLength);
    }
    public static void printArray(int[] array, int length){
        for(int i = 0 ; i < length ; i++){
            System.out.print(array[i] + " " );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.setRight(new BinaryTreeNode(3));
        root.getLeft().setLeft(new BinaryTreeNode(4));
        root.getLeft().setRight(new BinaryTreeNode(5));
        int[] pathArray = new int[1000];
        printPaths(root,pathArray,0);
    }
}
