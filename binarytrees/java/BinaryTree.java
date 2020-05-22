package binarytrees.java;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    TreeNode root;

    BinaryTree(Object e){
        root = new TreeNode(e);
    }

    BinaryTree(){
        root = null;
    }

    void inorder(TreeNode temp){
        if (temp == null) 
            return;

        inorder(temp.leftChild); 
        System.out.print(temp.data+" "); 
        inorder(temp.rightChild); 
    }

    void insert(TreeNode temp, Object key){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(temp);

        while (!q.isEmpty()){ 
            temp = q.peek(); 
            q.remove(); 
       
            if (temp.leftChild == null) { 
                temp.leftChild = new TreeNode(key); 
                break; 
            }else{
                q.add(temp.leftChild);
            } 
       
            if (temp.rightChild == null) { 
                temp.rightChild = new TreeNode(key); 
                break; 
            } else{
                q.add(temp.rightChild); 
            }
        }      
    }

    /** function to delete the given deepest node (d_node) in binary tree */
    void deleteDeepestNode(TreeNode root, TreeNode delNode){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode temp = null;

        while (!q.isEmpty()){ 
            temp = q.peek(); 
            q.remove(); 

            if(temp == delNode){
                return;
            }

            if(temp.rightChild != null){
                if(temp.rightChild == delNode){
                    temp.rightChild = null;
                }else{
                    q.add(temp.rightChild);
                }
            }

            if(temp.leftChild != null){
                if(temp.leftChild == delNode){
                    temp.leftChild = null;
                }else{
                    q.add(temp.leftChild);
                }
            }
        }
    }

    TreeNode delete(TreeNode root, Object key){
        /**
         *  1. Starting at root, find the deepest and rightmost node in binary tree and node which we want to delete.
         *  2. Replace the deepest rightmost node’s data with node to be deleted.
         *  3. Then delete the deepest rightmost node. 
         */

        if(root == null){
            return null;
        }

        if(root.leftChild == null && root.rightChild == null){
            if(root.data == key){
                return null;
            }else{
                return root;
            }
        }

        TreeNode delNode = null;
        TreeNode temp = null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){ 
            temp = q.peek(); 
            q.remove(); 
       
            if (temp.data == key) { 
                delNode = temp;
                break; 
            }else{
                q.add(temp.leftChild);
                q.add(temp.rightChild); 
            }
        }

        if(delNode != null){
            Object x = temp.data;
            deleteDeepestNode(root, temp);
            delNode.data = x;
        }
        return root;
    }
}