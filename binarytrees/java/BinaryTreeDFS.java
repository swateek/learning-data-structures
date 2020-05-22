package binarytrees.java;

public class BinaryTreeDFS {

    static void traverseDFSInOrder(TreeNode node){
        if(node == null){
            return;
        }

        traverseDFSInOrder(node.leftChild);
        System.out.print(node.data + "    ");
        traverseDFSInOrder(node.rightChild);
    }

    static void traverseDFSPreOrder(TreeNode node){
        if(node == null){
            return;
        }

        System.out.print(node.data + "    ");
        traverseDFSPreOrder(node.leftChild);
        traverseDFSPreOrder(node.rightChild);
    }

    static void traverseDFSPostOrder(TreeNode node){
        if(node == null){
            return;
        }

        traverseDFSPostOrder(node.leftChild);
        traverseDFSPostOrder(node.rightChild);
        System.out.print(node.data + "    ");
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

        /**
         *  DFS - inorder output will be:
         *      Inorder = Left, Root, Right
         *      4    2    5    1    6    3    7
         *  
         *  DFS - preorder output will be:
         *      preorder = Root, Left, Right
         *      1    2    4    5    3    6    7 
         *  
         *  DFS - postorder output will be:
         *      preorder = Left, Right, Root
         *      1 2 4 5 3 6 7
         */

        System.out.println("\n In-Order Traversal in DF");
        traverseDFSInOrder(tree.root); //  4    2    5    1    6    3    7 
        System.out.println("\n Pre-Order Traversal in DF");
        traverseDFSPreOrder(tree.root); // 1    2    4    5    3    6    7 
        System.out.println("\n Post-Order Traversal in DF");
        traverseDFSPostOrder(tree.root); // 4    5    2    6    7    3    1
    }
}