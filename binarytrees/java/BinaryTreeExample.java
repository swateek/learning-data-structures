package binarytrees.java;

public class BinaryTreeExample {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new TreeNode(1);
        tree.root.leftChild = new TreeNode(2);
        tree.root.rightChild = new TreeNode(3);

        tree.root.leftChild.leftChild = new TreeNode(4);

        System.out.println( "Inorder traversal BEFORE insertion:"); 
        tree.inorder(tree.root);

        int key = 8; 
        tree.insert(tree.root, key);

        System.out.println( "Inorder traversal AFTER insertion:"); 
        tree.inorder(tree.root);

        tree.delete(tree.root, 4);

        System.out.println( "Inorder traversal AFTER deletion:"); 
        tree.inorder(tree.root);
    }
}