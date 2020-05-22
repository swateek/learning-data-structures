package binarytrees.java;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBFS {

    static void LineOrderTraversal(TreeNode rootNode){
        if(rootNode == null){
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(rootNode);

        while(!q.isEmpty()){
            TreeNode currNode = q.peek();
            System.out.print(currNode.data + "  ");

            if(currNode.leftChild != null){
                q.add(currNode.leftChild);
            }

            if(currNode.rightChild != null){
                q.add(currNode.rightChild);
            }

            q.poll();
        }
    }
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new TreeNode(1);
        tree.root.leftChild = new TreeNode(2);
        tree.root.rightChild = new TreeNode(3);

        tree.root.leftChild.leftChild = new TreeNode(4);
        tree.root.leftChild.rightChild = new TreeNode(5);
        tree.root.rightChild.leftChild = new TreeNode(6);
        tree.root.rightChild.rightChild = new TreeNode(7);

        LineOrderTraversal(tree.root); // 1  2  3  4  5  6  7
    }
}