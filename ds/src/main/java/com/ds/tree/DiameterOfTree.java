package com.ds.tree;

import com.ds.dao.BinaryTreeNode;

/**
 * Created by anandkumar on 9/7/17.
 */
/*
Algorithm
The diameter of a tree T is the largest of the following quantities:

* the diameter of T’s left subtree
* the diameter of T’s right subtree
* the longest path between leaves that goes through the root of T (this can be computed
* from the heights of the subtrees of T)
 */
public class DiameterOfTree {
    class Height{
        int h ;
    }
    public int diameterOpt(BinaryTreeNode root , Height height) {
        if (root == null)
        {
            height.h = 0;
            return 0;
        }


        Height lh = new Height(), rh = new Height();
        int ldiameter = diameterOpt(root.getLeft(), lh);
        int rdiameter = diameterOpt(root.getRight(), rh);

        height.h = Math.max(lh.h, rh.h) + 1;

        return Math.max(lh.h + rh.h + 1, Math.max(ldiameter, rdiameter));
    }

    int diameter(BinaryTreeNode root)
    {
        Height height = new Height();
        return diameterOpt(root, height);
    }

    public static void main(String[] args) {

        BinaryTreeNode root = new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.setRight(new BinaryTreeNode(3));
        root.getLeft().setLeft(new BinaryTreeNode(4));
        root.getLeft().setRight(new BinaryTreeNode(5));
        DiameterOfTree diameterOfTree = new DiameterOfTree();
        System.out.println("The diameter of given binary tree is : "
                + diameterOfTree.diameter(root));

    }
}
