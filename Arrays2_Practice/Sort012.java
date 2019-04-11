package Codezen_Codes.Arrays2_Practice;

import java.util.Scanner;

public class Sort012 {
    public static Scanner s = new Scanner(System.in);

    public static int[] ReadArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Sort(int[] arr) {
        // 1st code
//            int n = arr.length;
//            for (int i = 0; i < n; i++) {
//                if (arr[i] == 2) {
//                    for (int j = i; j < n - 1; j++) {
//                        int temp = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp;
//                    }
//                    if (arr[i] == 2) {
//                        i--;
//                    }
//                    n--;
//                }
//            }
//            for (int i = 0; i < n; i++) {
//                if (arr[i] == 1) {
//                    for (int j = i; j < n - 1; j++) {
//                        int temp = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp;
//                    }
//                    if (arr[i] == 1) {
//                        i--;
//                    }
//                    n--;
//                }
//            }

        // 2nd code
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 2) {
//                if(arr[i+1]!=arr[i]) {
//                    for (int j = i; j < n - 1; j++) {
//                        int temp = arr[j];
//                        arr[j] = arr[j + c];
//                        arr[j + c] = temp;
//                    }
//                }
//                else{
//                    c=2;
//                    for (int j = i; j < n - 1; j++) {
//                        int temp = arr[j];
//                        arr[j] = arr[j + c];
//                        arr[j + c] = temp;
//                        c--;
//                    }
//                }
//                n--;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 1) {
//                if(arr[i+1]!=arr[i]) {
//                    for (int j = i; j < n - 1; j++) {
//                        int temp = arr[j];
//                        arr[j] = arr[j + c];
//                        arr[j + c] = temp;
//                    }
//                }
//                else{
//                    c=2;
//                    for (int j = i; j < n - 1; j++) {
//                        int temp = arr[j];
//                        arr[j] = arr[j + c];
//                        arr[j + c] = temp;
//                        c--;
//                    }
//                }
//
//                n--;
//            }
//        }
    // final code
        int zerocount=0,onecount=0,twocount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zerocount++;
            }
            else if(arr[i]==1){
                onecount++;
            }
            else{
                twocount++;
            }
        }
        int i=0;
        for( i=0;i<zerocount;i++){
            arr[i]=0;
        }
        for(;i<zerocount+onecount;i++){
            arr[i]=1;
        }
        for(;i<arr.length;i++){
            arr[i]=2;
        }
    }

    public static void main(String[] args) {
        int[] arr = ReadArray();
        Sort(arr);
        PrintArray(arr);
    }
}
