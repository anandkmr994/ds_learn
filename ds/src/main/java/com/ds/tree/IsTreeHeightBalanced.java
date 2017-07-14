package com.ds.tree;

import com.ds.dao.BinaryTreeNode;

/**
 * Created by anandkumar on 9/7/17.
 */
public class IsTreeHeightBalanced {
    class Height{
        int h ;
    }
    public boolean isBalanced(BinaryTreeNode root , Height height) {
        if (root == null)
        {
            height.h = 0;
            return true;
        }


        Height lh = new Height(), rh = new Height();
        boolean l = isBalanced(root.getLeft(), lh);
        boolean r = isBalanced(root.getRight(), rh);

        height.h = Math.max(lh.h, rh.h) + 1;

        if(rh.h - lh.h >=2 || lh.h - rh.h >=2)
            return false ;
        return l&&r;
    }

    boolean isBalanced(BinaryTreeNode root)
    {
        Height height = new Height();
        return isBalanced(root, height);
    }

    public static void main(String[] args) {

        BinaryTreeNode root = new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.setRight(new BinaryTreeNode(3));
        root.getRight().setLeft(new BinaryTreeNode(7));
        root.getLeft().setLeft(new BinaryTreeNode(4));
        root.getLeft().setRight(new BinaryTreeNode(5));
        IsTreeHeightBalanced isTreeHeightBalanced = new IsTreeHeightBalanced();
        System.out.println("The diameter of given binary tree is : "
                + isTreeHeightBalanced.isBalanced(root));

    }
}
