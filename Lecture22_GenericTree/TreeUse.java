package Lecture22_GenericTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class treePair {
    TreeNode<Integer> reference;
    int maxSum;
}

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
        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> node = pendingNodes.remove();
            String str = node.data + ":";
            if (node.children.size() >= 1) {
                int i = 0;
                for (; i < node.children.size() - 1; i++) {
                    str += node.children.get(i).data + ",";
                    pendingNodes.add(node.children.get(i));
                }
                str += node.children.get(i).data;
                pendingNodes.add(node.children.get(i));
                System.out.println(str);
            } else {
                System.out.println(str);
                ;
            }
        }
    }

    public static int nodesGreaterThanX(TreeNode<Integer> root, int x) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.data > x) {
            count++;
        }
        for (TreeNode<Integer> child : root.children) {
            count += nodesGreaterThanX(child, x);
        }
        return count;
    }

    public static int countLeafNodes(TreeNode<Integer> root) {
        int count = 0;
        if (root.children.size() == 0) {
            count++;
        }
        for (TreeNode<Integer> child : root.children) {
            count += countLeafNodes(child);
        }
        return count;
    }

    public static void PrintNodesAtDepthK(TreeNode<Integer> root, int k) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            TreeNode<Integer> node = queue.remove();
            if (node == null) {
                if (queue.size() != 0) {
                    queue.add(null);
                }
            }
            if (k == 0 && queue.size() != 0) {
                System.out.print(node.data + " ");
                while (node != null) {
                    node = queue.remove();
                    System.out.print(node.data + " ");
                }
            } else {
                k--;
            }
        }

    }

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x) {
        if (root == null) {
            return false;
        }
        if (root.data == x) {
            return true;
        }
        boolean ans = false;
        for (TreeNode<Integer> child : root.children) {
            ans = ans || checkIfContainsX(child, x);
        }
        return ans;
    }

    public static treePair maxTreeNode(TreeNode<Integer> root) {
        if (root == null) {
            treePair baseCase = new treePair();
            baseCase.reference = null;
            baseCase.maxSum = 0;
            return baseCase;
        }
        int sum = root.data;
        for (TreeNode<Integer> child : root.children) {
            sum += child.data;
        }
        treePair[] max = new treePair[root.children.size()];
        int i = 0;
        for (TreeNode<Integer> child : root.children) {
            max[i++] = maxTreeNode(child);
        }
        if (max.length > 0) {
            treePair x = max[0];
            for (i = 1; i < max.length; i++) {
                treePair y = max[i];
                if (y.maxSum > x.maxSum) {
                    x = y;
                }
            }
            if (x.maxSum > sum) {
                return x;
            } else {
                treePair ans = new treePair();
                ans.reference = root;
                ans.maxSum = sum;
                return ans;
            }
        }
        treePair ans = new treePair();
        ans.reference = root;
        ans.maxSum = sum;
        return ans;
    }

    public static TreeNode<Integer> dummy(TreeNode<Integer> root) {
        treePair x = maxTreeNode(root);
        return x.reference;
    }

    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int x) {
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        Queue<TreeNode<Integer>> max = new LinkedList<>();
        while (!queue.isEmpty()) {
            TreeNode<Integer> node = queue.remove();
            // queue.add(node);
            for (TreeNode<Integer> child : node.children) {
                queue.add(child);
            }
            if (node.data > x) {
                max.add(node);
            }
        }
        int minDiff = Integer.MAX_VALUE;
        TreeNode<Integer> minRef = null;
        while (!max.isEmpty()) {
            TreeNode<Integer> node = max.remove();
            if ((node.data - x) < minDiff) {
                minDiff = node.data - x;
                minRef = node;
            }
        }
        if (minDiff != Integer.MAX_VALUE && minRef != null) {
            return minRef;
        }
        return null;
    }

    public static boolean StructurallyIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
        Queue<TreeNode<Integer>> queue1 = new LinkedList<>();
        Queue<TreeNode<Integer>> queue2 = new LinkedList<>();
        queue1.add(root1);
        queue2.add(root2);
        if (root1.data == root2.data) {
            while (!queue1.isEmpty() || !queue2.isEmpty()) {
                TreeNode<Integer> node1 = queue1.remove();
                TreeNode<Integer> node2 = queue2.remove();
                if (node1.data == node2.data) {
                    for (TreeNode<Integer> child1 : node1.children) {
                        queue1.add(child1);
                    }
                    for (TreeNode<Integer> child2 : node2.children) {
                        queue2.add(child2);
                    }
                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void replaceWithDepthValue(TreeNode<Integer> root) {
        int k = 0;
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        root.data = k;
        while (!queue.isEmpty()) {
            TreeNode<Integer> node = queue.remove();
            if (node == null) {
                k++;
                if (queue.size() != 0) {
                    queue.add(null);
                }
            } else {
                for (TreeNode<Integer> child : node.children) {
                    queue.add(child);
                    child.data = k + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TakeInput();
//        printLevelWise(root);
        PrintTreeLevelWise2(root);
    }
}