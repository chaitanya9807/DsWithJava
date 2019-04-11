package Lecture22_GenericTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {
    public static Scanner s = new Scanner(System.in);

//    public static TreeNode<Integer> takeInput() {
//        System.out.println("Enter root's data:");
//        int root = s.nextInt();
//        TreeNode<Integer> rootN = new TreeNode<>(root);
//        System.out.println("Enter number of children of " + root + ":");
//        int children = s.nextInt();
//        for (int i = 0; i < children; i++) {
//            TreeNode<Integer> child = takeInput();
//            rootN.children.add(child);
//        }
//        return rootN;
//    }

    public static int countNoOfNodes(TreeNode<Integer> root) {
        int count = 1;
        for (TreeNode<Integer> child : root.children) {
            count += countNoOfNodes(child);
        }
        return count;
    }

    public static int sumOfNodes(TreeNode<Integer> root) {
        int sum = root.data;
        for (TreeNode<Integer> child : root.children) {
            sum += sumOfNodes(child);
        }
        return sum;
    }

    public static TreeNode<Integer> findMaxNode(TreeNode<Integer> root) {
        TreeNode<Integer> maxDataNode = root;
        for (TreeNode<Integer> child : root.children) {
            TreeNode<Integer> maxDataChild = findMaxNode(child);
            if (maxDataChild.data > maxDataNode.data) {
                maxDataNode = maxDataChild;
            }
        }
        return maxDataNode;
    }

    public static TreeNode<Integer> TakeInput() {
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root's data: ");
        TreeNode<Integer> root = new TreeNode<>(s.nextInt());
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> node = pendingNodes.remove();
            System.out.println("Enter no of children of " + node.data);
            int numOfChildren = s.nextInt();
            for (int i = 0; i < numOfChildren; i++) {
                System.out.println("Enter the value of " + i + "th child of " + node.data);
                int childData = s.nextInt();
                TreeNode<Integer> child = new TreeNode<>(childData);
                node.children.add(child);
                pendingNodes.add(child);
            }
        }
        return root;
    }

    public static void printLevelWise(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> node = pendingNodes.remove();
            System.out.print(node.data + " ");
            for (TreeNode<Integer> child : node.children) {
                pendingNodes.add(child);
            }
        }
    }

    public static void printLevelWise1(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);
        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> node = pendingNodes.remove();
            if (node == null) {
                if (pendingNodes.size() != 0) {
                    pendingNodes.add(null);
                    System.out.println();
                }
            } else {
                System.out.print(node.data + " ");
                for (TreeNode<Integer> child : node.children) {
                    pendingNodes.add(child);
                }
            }
        }
    }

    public static void PrintTreeLevelWise2(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);
        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> node = pendingNodes.remove();
            if (node == null) {
                if (pendingNodes.size() != 0) {
                    pendingNodes.add(null);
                    System.out.println();
                }
            } else {
                String str = node.data + ":";
                for (int i = 0; i < node.children.size() - 1; i++) {
                    str += node.data + ",";
                    pendingNodes.add(node);
                }
                str += node.data;
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TakeInput();
        printLevelWise(root);
    }
}