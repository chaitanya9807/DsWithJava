package Lecture23_24_25_BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BalancedPair {
    int height;
    boolean isBalanced;
}

class DiameterPair {
    int height;
    int diameter;
}

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    LinkedListNode(T data) {
        this.data = data;
    }
}

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
            System.out.println("Enter left child of " + node.data + ": ");
            int leftChild = s.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> leftNode = new BinaryTreeNode<>(leftChild);
                node.left = leftNode;
                queue.add(leftNode);
            }
            System.out.println("Enter right child of " + node.data + ": ");
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

    public static boolean FindNode(BinaryTreeNode<Integer> root, int n) {
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

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    /* visiting each node twice to get two different values
     instead make a class with the required properties and return the object of that class
     making the code efficient and hence making the approach bad. */
    public static boolean isBalanced(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (Math.abs(leftHeight - rightHeight) <= 1) {
            return isBalanced(root.left) && isBalanced(root.right);
        } else {
            return false;
        }
    }

    public static BalancedPair isBalanceBetterApproach(BinaryTreeNode<Integer> root) {
        if (root == null) {
            BalancedPair BaseCase = new BalancedPair();
            BaseCase.height = 0;
            BaseCase.isBalanced = true;
            return BaseCase;
        }
        BalancedPair left = isBalanceBetterApproach(root.left);
        BalancedPair right = isBalanceBetterApproach(root.right);
        BalancedPair retVal = new BalancedPair();
        retVal.height = Math.max(left.height, right.height) + 1;
        /*if (Math.abs(left.height - right.height) <= 1) {
            retVal.isBalanced = left.isBalanced && right.isBalanced;
        } else {
            retVal.isBalanced = false;
        }*/
        retVal.isBalanced = Math.abs(left.height - right.height) <= 1 && (left.isBalanced && right.isBalanced);
        return retVal;
    }

    /* visiting each node twice to get two different values
     instead make a class with the required properties and return the object of that class
     making the code efficient and hence making the approach bad. */
    public static int diameter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int height = height(root.left) + height(root.right);
        int leftDiam = diameter(root.left);
        int rightDiam = diameter(root.right);
        return Math.max(height, Math.max(leftDiam, rightDiam));
    }

    public static DiameterPair diameterBetter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            DiameterPair BaseCase = new DiameterPair();
            return BaseCase;
        }
        DiameterPair left = diameterBetter(root.left);
        DiameterPair right = diameterBetter(root.right);
        DiameterPair retVal = new DiameterPair();
        retVal.height = Math.max(left.height, right.height) + 1;
        retVal.diameter = Math.max((left.height + right.height + 1), Math.max(left.diameter, right.diameter));
        return retVal;
    }

    public static BinaryTreeNode<Integer> ConstructWithInorderAndPreorder(int[] pre, int sPre, int ePre, int[] In, int sIn, int eIn) {
        if ((sPre > ePre) || (sIn > eIn)) {
            return null;
        }
        int rootelement = pre[sPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootelement);
        int pos = -1;
        for (int i = sIn; i <= eIn; i++) {
            if (In[i] == rootelement) {
                pos = i;
                break;
            }
        }
        int count = pos - sIn;
        root.left = ConstructWithInorderAndPreorder(pre, sPre + 1, sPre + count, In, sIn, pos - 1);
        root.right = ConstructWithInorderAndPreorder(pre, sPre + count + 1, ePre, In, pos + 1, eIn);
        return root;
    }

    public static BinaryTreeNode<Integer> SearchInBST(BinaryTreeNode<Integer> root, int element) {
        if (root == null) {
            return null;
        }
        if (root.data == element) {
            return root;
        } else {
            if (root.data < element) {
                return SearchInBST(root.right, element);
            } else {
                return SearchInBST(root.left, element);
            }
        }
    }

    public static ArrayList findPath(BinaryTreeNode<Integer> root, int element) {
        if (root == null) {
            return null;
        }
        if (root.data == element) {
            ArrayList<Integer> path = new ArrayList<>();
            path.add(root.data);
            return path;
        } else if (root.data > element) {
            ArrayList<Integer> path = findPath(root.left, element);
            if (path != null) {
                path.add(root.data);
            }
            return path;
        } else {
            ArrayList<Integer> path = findPath(root.right, element);
            if (path != null) {
                path.add(root.data);
            }
            return path;
        }
    }

    public static BinaryTreeNode<Integer> generateBST(int[] arr, int sI, int eI) {
        if (sI > eI) {
            return null;
        }
        int mid = (sI + eI) / 2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = generateBST(arr, sI, mid - 1);
        root.right = generateBST(arr, mid + 1, eI);
        return root;
    }

    public static LinkedListNode<Integer> BSTtoSortedLL(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        LinkedListNode<Integer> rootNode = new LinkedListNode<>(root.data);
        LinkedListNode<Integer> head = rootNode;
        LinkedListNode<Integer> leftHead = BSTtoSortedLL(root.left);
        LinkedListNode<Integer> rightHead = BSTtoSortedLL(root.right);
        if (leftHead != null) {
            head = leftHead;
            LinkedListNode<Integer> temp = leftHead;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = rootNode;
        }
        rootNode.next = rightHead;
        return head;
    }

    public static boolean isBST_(BinaryTreeNode<Integer> root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data >= min && root.data <= max) {
            return isBST_(root.left, min, root.data - 1) && isBST_(root.right, root.data, max);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput();
        PrintLevelWise(root);
    }
}