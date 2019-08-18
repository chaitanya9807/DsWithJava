package Lecture23_24_25_BinaryTree;

public class BST {
    private BinaryTreeNode<Integer> root;

    public void insertData(int k) {
        root = insertHelper(root, k);
    }

    private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int k) {
        if (root == null) {
            BinaryTreeNode<Integer> node = new BinaryTreeNode<>(k);
            return node;
        }
        if (root.data == k) {
            return root;
        } else if (root.data > k) {
            root.left = insertHelper(root.left, k);
            return root;
        } else {
            root.right = insertHelper(root.right, k);
            return root;
        }
    }

    public boolean search(int k) {
        return searchHelper(root, k);
    }

    private boolean searchHelper(BinaryTreeNode<Integer> root, int k) {
        if (root == null) {
            return false;
        }
        if (root.data == k) {
            return true;
        } else if (root.data > k) {
            return searchHelper(root.left, k);
        } else {
            return searchHelper(root.right, k);
        }
    }

    private BinaryTreeNode<Integer> findSuccessorNode(BinaryTreeNode<Integer> root) {
        BinaryTreeNode<Integer> temp = root.right;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    public void deleteData(int k) {
        root = deleteHelper(root, k);
    }

    private BinaryTreeNode deleteHelper(BinaryTreeNode<Integer> root, int k) {
        if (root == null) {
            return null;
        }
        if (root.data == k) {
            if (root.left == null && root.right == null) {  // Leaf node
                return null;
            } else if (root.left == null) {     // Node with only right child
                return root.right;
            } else if (root.right == null) {    // Node with only left child
                return root.left;
            } else {                            // Node with both children
                BinaryTreeNode<Integer> successsor = findSuccessorNode(root);
                root.data = successsor.data;
                deleteHelper(root.right, successsor.data);
                return root;
            }
        } else if (root.data >   k) {
            root.left = deleteHelper(root.left, k);
            return root;
        } else {
            root.right = deleteHelper(root.right, k);
            return root;
        }
    }

    public void printTree() {
        printTreeHelper(root);
    }

    private void printTreeHelper(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        String str = root.data + ":";
        if (root.left != null) {
            str += "L:" + root.left.data + ",";
        }
        if (root.right != null) {
            str += "R:" + root.right.data;
        }
        System.out.println(str);
        printTreeHelper(root.left);
        printTreeHelper(root.right);
    }
}
