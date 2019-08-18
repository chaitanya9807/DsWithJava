package Lecture18_19_20_LinkedList;

import java.util.Scanner;

public class SkipMdeleteN {

    public static Scanner s = new Scanner(System.in);

    public static LinkedListNode<Integer> takeinput() {
        int data = s.nextInt();
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        while (data != -1) {
            LinkedListNode<Integer> node = new LinkedListNode<>(data);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void printLL(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static LinkedListNode<Integer> delete(LinkedListNode<Integer> head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        }
        int i = 0, j = 0;
        LinkedListNode<Integer> temp1 = head;
        LinkedListNode<Integer> temp2 = null;
        while (i < m - 1) {
            if (temp1 != null && temp1.next != null) {
                temp1 = temp1.next;
                i++;
            } else {
                break;
            }
        }
        if (temp1 != null && temp1.next != null) {
            temp2 = temp1.next;
        }
        while (j < n - 1) {
            if (temp2 != null && temp2.next != null) {
                temp2 = temp2.next;
                j++;
            } else {
                break;
            }
        }
        if (temp2 != null && temp2.next != null) {
            LinkedListNode<Integer> res = delete(temp2.next, m, n);
            temp1.next = res;
        } else {
            temp1.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeinput();
        delete(head, s.nextInt(), s.nextInt());
        printLL(head);
    }
}
