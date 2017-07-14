package com.ds.tree;

import com.ds.dao.BinaryTreeNode;

/**
 * Created by anandkumar on 9/7/17.
 */
/*
Algorithm
Recursively check if left or right child has path sum equal to ( number – value at current node)
 */
public class HasPathEqualSum {
    public static boolean hasPathSum(BinaryTreeNode root , int sum) {
        if(root == null)
            return sum == 0;
        else {
            boolean ans = false;

            int subsum = sum - root.getData();
            if (subsum == 0 && root.getLeft() == null && root.getRight() == null)
                return true;
            if (root.getRight() != null)
                ans = ans || hasPathSum(root.getRight(), subsum);
            if (root.getLeft() != null)
                ans = ans || hasPathSum(root.getLeft(), subsum);
            return ans ;
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.setRight(new BinaryTreeNode(3));
        root.getLeft().setLeft(new BinaryTreeNode(4));
        root.getLeft().setRight(new BinaryTreeNode(5));
        System.out.println("tree has a path with sum 8 : " + hasPathSum(root,8));
    }
}
