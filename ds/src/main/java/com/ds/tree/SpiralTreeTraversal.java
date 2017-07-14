package com.ds.tree;

import com.ds.dao.BinaryTreeNode;
import com.ds.dao.CustomQueue;

/**
 * Created by anandkumar on 8/7/17.
 */
public class SpiralTreeTraversal {
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
        Boolean flip = true ;
        while(!queue.isEmpty()){
            object = queue.dequeue();
            if(object instanceof String && "end".equals((String)object)){
                System.out.println();
                flip = flip == false ? true : false ;
                if(!queue.isEmpty()){
                    queue.enqueue("end");
                }
            }else{
                node = (BinaryTreeNode)object ;
                System.out.print(node.getData() + " ");
                if(flip) {
                    if (null != node.getLeft())
                        queue.enqueue(node.getLeft());
                    if (null != node.getRight())
                        queue.enqueue(node.getRight());
                }else{
                    if (null != node.getRight())
                        queue.enqueue(node.getRight());
                    if (null != node.getLeft())
                        queue.enqueue(node.getLeft());
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
        traverse(root);
    }
}
