package com.ds.tree;

import com.ds.dao.BinaryTreeNode;
import com.ds.dao.CustomQueue;

/**
 * Created by anandkumar on 4/7/17.
 */
public class LevelOrderTraversal {
    public static void traverse(BinaryTreeNode root) {
        if(null == root){
            System.out.println("empty tree");
            return ;
        }

        CustomQueue<Object> queue = new CustomQueue<Object>();
        queue.enqueue(root);
        queue.enqueue("end");
        Object object = null ;
        BinaryTreeNode node = null ;
        while(!queue.isEmpty()){
            object = queue.dequeue();
            if(object instanceof String && "end".equals((String)object)){
                System.out.println();
                if(!queue.isEmpty()){
                    queue.enqueue("end");
                }
            }else{
                node = (BinaryTreeNode)object ;
                System.out.print(node.getData() + " ");
                if(null != node.getLeft())
                    queue.enqueue(node.getLeft());
                if(null != node.getRight())
                    queue.enqueue(node.getRight());

            }
        }
    }
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.setRight(new BinaryTreeNode(3));
        root.getLeft().setLeft(new BinaryTreeNode(4));
        root.getLeft().setRight(new BinaryTreeNode(5));
        traverse(root);
    }
}
