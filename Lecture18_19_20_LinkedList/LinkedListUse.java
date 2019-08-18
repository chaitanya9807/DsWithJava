package Lecture18_19_20_LinkedList;

import java.util.Scanner;

public class LinkedListUse {
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

    public static int findLength(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static int SumOfAllNodes(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        int sum = 0;
        while (temp != null) {
            sum = sum + temp.data;
            temp = temp.next;
        }
        return sum;
    }

    public static void PrintLLRecursive(LinkedListNode<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        PrintLLRecursive(head.next);
    }

    public static int LengthRecursive(LinkedListNode<Integer> head) {
        if (head == null) {
            return 0;
        }
        return 1 + LengthRecursive(head.next);
    }

    public static void PrintLLInReverse(LinkedListNode<Integer> head) {
        if (head == null) {
            return;
        }
        PrintLLInReverse(head.next);
        System.out.print(head.data + " ");
    }

    public static void PrintElementAtPos(LinkedListNode<Integer> head, int pos) {
        if (pos < 0 || pos >= findLength(head)) {
            return;
        } else {
            LinkedListNode<Integer> temp = head;
            int i = 0;
            while (i < pos) {
                i++;
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }

    public static LinkedListNode<Integer> InsertAtIthPos(LinkedListNode<Integer> head, int element, int pos) {
        if (pos < 0 || pos > findLength(head)) {
            return head;
        } else {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(element);
            if (pos == 0) {
                newNode.next = head;
                head = newNode;
                return head;
            } else {
                LinkedListNode<Integer> temp = head;
                int i = 0;
                while (i < pos - 1) {
                    i++;
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
        }
    }

    public static LinkedListNode<Integer> InsertRecursively(LinkedListNode<Integer> head, int element, int pos) {
        if (head == null && pos != 0) {
            return head;
        }
        if (pos == 0) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(element);
            newNode.next = head;
            head = newNode;
            return head;
        }
        LinkedListNode<Integer> SubListHead = InsertRecursively(head.next, element, pos - 1);
        head.next = SubListHead;
        return head;
    }

    public static LinkedListNode<Integer> DeleteFromIthPos(LinkedListNode<Integer> head, int pos) {
        if (pos < 0 || pos >= findLength(head)) {
            return head;
        } else {
            if (pos == 0) {
                head = head.next;
                return head;
            }
            int i = 0;
            LinkedListNode<Integer> temp = head;
            while (i < pos - 1) {
                i++;
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return head;
        }
    }

    public static LinkedListNode<Integer> Deleterecursively(LinkedListNode<Integer> head, int pos) {
        if (head == null && pos != 0) {
            return head;
        }
        if (pos == 0 && head != null) {
            LinkedListNode<Integer> temp = head;
            temp = temp.next;
            return temp;
        } else if (head == null) {
            return head;
        }
        LinkedListNode<Integer> SubListHead = Deleterecursively(head.next, pos - 1);
        head.next = SubListHead;
        return head;
    }

        public static LinkedListNode<Integer> ReturnMiddleNode(LinkedListNode<Integer> head) {
            LinkedListNode<Integer> Slow = head;
            LinkedListNode<Integer> Fast = head;
            while (Fast.next != null && Fast.next.next != null) {
                Slow = Slow.next;
                Fast = Fast.next.next;
            }
            return Slow;
        }

    public static LinkedListNode<Integer> ReverseLL(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> Current = head;
        LinkedListNode<Integer> Previous = null;
        while (Current != null) {
            LinkedListNode<Integer> next = Current.next;
            Current.next = Previous;
            Previous = Current;
            Current = next;
        }
        return Previous;
    }

    public static LinkedListNode<Integer> ReverseLLRecursive(LinkedListNode<Integer> head) {
        if (head.next == null) {
            return head;
        }
        LinkedListNode<Integer> SubListHead = ReverseLLRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return SubListHead;
    }

    public static Boolean CheckPalindrome(LinkedListNode<Integer> head) {
        LinkedListNode mid = ReturnMiddleNode(head);
        LinkedListNode temp = mid.next;
        mid.next = null;
        LinkedListNode head2 = ReverseLL(temp);
        LinkedListNode temp1 = head;
        LinkedListNode temp2 = head2;
        while (temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }

    public static LinkedListNode<Integer> mergeTwoSortedLL(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        LinkedListNode<Integer> temp1 = head1;
        LinkedListNode<Integer> temp2 = head2;
        if (temp1.data < temp2.data) {
            head = temp1;
            tail = temp1;
            temp1 = temp1.next;
        } else {
            head = temp2;
            tail = temp2;
            temp2 = temp2.next;
        }
        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                tail.next = temp1;
                tail = temp1;
                temp1 = temp1.next;
            } else {
                tail.next = temp2;
                tail = temp2;
                temp2 = temp2.next;
            }
        }
        if (temp1 == null) {
            tail.next = temp2;
        } else {
            tail.next = temp1;
        }
        return head;
    }

    public static LinkedListNode<Integer> MergeSortLL(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> mid = ReturnMiddleNode(head);
        LinkedListNode<Integer> temp = mid.next;
        mid.next = null;
        LinkedListNode<Integer> head1 = MergeSortLL(head);
        LinkedListNode<Integer> head2 = MergeSortLL(temp);
        head = mergeTwoSortedLL(head1, head2);
        return head;
    }

    public static LinkedListNode<Integer> RemoveDuplicate(LinkedListNode<Integer> head) {
        if (head.next == null) {
            return head;
        }
        LinkedListNode<Integer> SubListhead = RemoveDuplicate(head.next);
        if (head.data.equals(SubListhead.data)) {
            head.next = SubListhead.next;
        }
        return head;
    }

    public static int search(LinkedListNode<Integer> head, int element) {
        LinkedListNode<Integer> temp = head;
        int i = 0;
        while (temp.next != null) {
            if (temp.data == element) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public static int SearchRecursive(LinkedListNode<Integer> head, int element, int i) {
        if (head == null) {
            return 0;
        }
        if (head.data == element) {
            return i;
        }
        int res = SearchRecursive(head.next, element, i - 1);
        return res;
    }

    public static LinkedListNode<Integer> nthNodeFromLast(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> first = head;
        LinkedListNode<Integer> second = head;
        int i = 0;
        while (i < n) {
            if (second == null) {
                return null;
            }
            second = second.next;
            i++;
        }
        while (second != null && second.next != null) {
            first = first.next;
            second = second.next;
        }
        return first;
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

    public static LinkedListNode<Integer> swap(LinkedListNode<Integer> head, int pos1, int pos2) {
        if (pos1 < 0 || pos2 < 0 || pos1 > findLength(head) || pos2 > findLength(head)) {
            return head;
        }
        LinkedListNode<Integer> prevNode1 = head;
        LinkedListNode<Integer> prevNode2 = head;
        LinkedListNode<Integer> temp1 = head;
        LinkedListNode<Integer> temp2 = head;
        LinkedListNode<Integer> nextNode1 = head;
        LinkedListNode<Integer> nextNode2 = head;
        int i = 0, j = 0;
        if (pos1 == 0 && pos2 > 1) {
            nextNode1 = temp1.next;
            while (j < pos2 - 1) {
                prevNode2 = temp2.next;
                temp2 = temp2.next;
                j++;
            }
            temp2 = temp2.next;
            nextNode2 = temp2.next;
            prevNode2.next = temp1;
            temp1.next = nextNode2;
            temp2.next = nextNode1;
            head = temp2;
            return head;
        } else if (pos2 == 0 && pos1 > 1) {
            nextNode2 = temp2.next;
            while (i < pos1 - 1) {
                prevNode1 = temp1.next;
                temp1 = temp1.next;
                i++;
            }
            temp1 = temp1.next;
            nextNode1 = temp1.next;
            prevNode1.next = temp2;
            temp2.next = nextNode1;
            temp1.next = nextNode2;
            head = temp1;
            return head;
        } else if (pos1 == 0 && pos2 == 1) {
            temp2 = temp2.next;
            nextNode2 = temp2.next;
            head = temp2;
            temp2.next = temp1;
            temp1.next = nextNode2;
            return head;
        } else if (pos2 == 0 && pos1 == 1) {
            temp1 = temp1.next;
            nextNode1 = temp1.next;
            head = temp1;
            temp1.next = temp2;
            temp2.next = nextNode1;
            return head;
        } else if (pos1 - pos2 == 1 || pos2 - pos1 == 1) {
            if (pos1 > pos2) {
                while (i < pos1 - 1) {
                    prevNode1 = temp1.next;
                    temp1 = temp1.next;
                    i++;
                }
                temp1 = temp1.next;
                temp2 = temp1.next;
                nextNode2 = temp2.next;
                prevNode1.next = temp2;
                temp2.next = temp1;
                temp1.next = nextNode2;
                return head;
            } else {
                while (i < pos2 - 2) {
                    prevNode2 = temp2.next;
                    temp2 = temp2.next;
                    i++;
                }
                temp2 = temp2.next;
                temp1 = temp2.next;
                nextNode1 = temp1.next;
                prevNode2.next = temp1;
                temp1.next = temp2;
                temp2.next = nextNode1;
                return head;
            }
        } else {
            while (i < pos1 - 1) {
                prevNode1 = temp1.next;
                temp1 = temp1.next;
                i++;
            }
            temp1 = temp1.next;
            nextNode1 = temp1.next;
            while (j < pos2 - 1) {
                prevNode2 = temp2.next;
                temp2 = temp2.next;
                j++;
            }
            temp2 = temp2.next;
            nextNode2 = temp2.next;
            prevNode1.next = temp2;
            temp2.next = nextNode1;
            prevNode2.next = temp1;
            temp1.next = nextNode2;
            return head;
        }
    }

    public static LinkedListNode<Integer> BubbleSort(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prevNode = null;
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> nextNode = head.next;
        for (int i = 0; i < findLength(head); i++) {
            temp = head;
            nextNode = temp.next;
            prevNode = null;
            while (temp.next != null) {
                if (temp.data > nextNode.data) {
                    if (prevNode == null) {
                        temp.next = nextNode.next;
                        nextNode.next = temp;
                        prevNode = nextNode;
                        head = nextNode;
                        nextNode = temp.next;
                    } else {
                        prevNode.next = temp.next;
                        temp.next = nextNode.next;
                        nextNode.next = temp;
                        prevNode = prevNode.next;
                        nextNode = temp.next;
                    }
                } else {
                    prevNode = temp;
                    temp = temp.next;
                    nextNode = temp.next;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeinput();
//        printLL(head);
//        System.out.println(findLength(head));
//        System.out.println(SumOfAllNodes(head));
//        System.out.println(LengthRecursive(head));
//        PrintLLRecursive(head);
//        System.out.println();
//        PrintLLInReverse(head);
//        PrintElementAtPos(head, s.nextInt());
//        head = InsertAtIthPos(head, s.nextInt(), s.nextInt());
//        InsertRecursively(head, s.nextInt(), s.nextInt());
//        printLL(head);
//        head = Deleterecursively(head, s.nextInt());
//        head = ReverseLL(head);
//        head = ReverseLLRecursive(head);
//        printLL(head);
//        System.out.print(CheckPalindrome(head));
//        LinkedListNode<Integer> head2 = takeinput();
//        head = mergeTwoSortedLL(head, head2);
//        head = MergeSortLL(head);
//        head = RemoveDuplicate(head);
//        head = swap(head, s.nextInt(), s.nextInt());
//        head = delete(head, s.nextInt(), s.nextInt());
        //  head = BubbleSort(head);
//        LinkedListNode<Integer> n1 = new LinkedListNode<>(10);
        LinkedListNode<Integer> node = nthNodeFromLast(head, s.nextInt());
        System.out.println(node);
//        printLL(head);
    }
}