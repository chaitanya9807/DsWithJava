package Codezen_Codes.Arrays1_Practice;

import java.util.Scanner;

public class PrintArrayIntersection {
    public static int[] ReadArray() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void IntersectingElements(int[] arr1, int[] arr2) {
        if(arr1.length<arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        System.out.println(arr1[i]);
                        break;
                    }
                }
            }
        }
        else{
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if (arr2[i] == arr1[j]) {
                        System.out.println(arr2[i]);
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = ReadArray();
        int[] arr2 = ReadArray();
        IntersectingElements(arr1, arr2);

    }
}
