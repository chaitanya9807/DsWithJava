package Lecture9_Recursion1;

import java.util.Scanner;

public class LastOccurence {
    public static Scanner s = new Scanner(System.in);

    public static int Last(int[] arr, int element, int sI) {
        if (sI == arr.length) {
            return -1;
        }
        int flag = Last(arr, element, sI + 1);
        if (flag == -1) {
            if (arr[sI] == element) {
                return sI;
            } else {
                return -1;
            }
        } else {
            return flag;
        }
    }

    public static void main(String[] args) {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int element = s.nextInt();
        System.out.print(Last(arr, element, 0));
    }
}
