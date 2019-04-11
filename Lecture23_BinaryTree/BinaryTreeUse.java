package Lecture23_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
    public static Scanner s = new Scanner(System.in);

    public static BinaryTreeNode<Integer> takeInput() {
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        System.out.println("Enter root's data: ");
        int first = s.nextInt();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(first);
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> node = queue.remove();
            System.out.println("Enter left child of" + node.data + ": ");
            int leftChild = s.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(leftChild);
                node.left = leftNode;
                queue.add(leftNode);
            }
            System.out.println("Enter right child of" + node.data + ": ");
            int rightChild = s.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> rightNode = new BinaryTreeNode<>(rightChild);
                node.right = rightNode;
                queue.add(rightNode);
            }
        }
        return root;
    }

    public static void PreOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }

    public static void InorderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        InorderTraversal(root.left);
        System.out.print(root.data + " ");
        InorderTraversal(root.right);
    }

    public static void PostOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static int sumOfAllNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int sum = root.data;
        sum += sumOfAllNodes(root.left);
        sum += sumOfAllNodes(root.right);
        return sum;
    }

    public static int countNoOfNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        count += countNoOfNodes(root.left);
        count += countNoOfNodes(root.right);
        return count;
    }

    public static Boolean FindNode(BinaryTreeNode<Integer> root, int n) {
        if (root == null) {
            return false;
        }
        if (root.data == n) {
            return true;
        }
        if (FindNode(root.left, n)) {
            return true;
        } else if (FindNode(root.right, n)) {
            return true;
        }
        return false;
    }

    public static int countLeafNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        } else {
            int count = 0;
            count += countLeafNodes(root.left);
            count += countLeafNodes(root.right);
            return count;
        }
    }

    public static void Mirror(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Mirror(root.left);
        Mirror(root.right);
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static BinaryTreeNode<Integer> findMaxDataNode(BinaryTreeNode<Integer> root) {
        if (root == null) {
            BinaryTreeNode<Integer> base = new BinaryTreeNode<>(Integer.MIN_VALUE);
            return base;
        }
        BinaryTreeNode<Integer> leftMax = findMaxDataNode(root.left);
        BinaryTreeNode<Integer> rightMax = findMaxDataNode(root.right);
        BinaryTreeNode<Integer> maxNode = root;
        if (maxNode.data > leftMax.data && maxNode.data > rightMax.data) {
            return maxNode;
        } else if (leftMax.data > maxNode.data && leftMax.data > rightMax.data) {
            return leftMax;
        } else {
            return rightMax;
        }
    }

    public static void PrintLevelWise(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> node = queue.remove();
            if (node == null) {
                if (!queue.isEmpty()) {
                    queue.add(null);
                    System.out.println();
                }
            } else {
                System.out.print(node.data + " ");
            }
        }
    }

    public static int NodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.data > x) {
            count++;
        }
        count += NodesGreaterThanX(root.left, x);
        count += NodesGreaterThanX(root.right, x);
        return count;
    }

    public static void printLevelWiseColonPattern(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> node = queue.remove();
            String str = node.data + ":L:";
            if (node.left != null) {
                str += node.left.data + ",R:";
                queue.add(node.left);
            } else {
                str += "-1,R:";
            }
            if (node.right != null) {
                str += node.right.data;
                queue.add(node.right);
            } else {
                str += "-1";
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput();
        PrintLevelWise(root);
    }
}