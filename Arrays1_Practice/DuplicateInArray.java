package Codezen_Codes.Arrays1_Practice;

import java.util.Scanner;

public class DuplicateInArray {
    public static int[] ReadArray() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int FindDuplicate(int[] arr) {
//        int pos = -1;
//        for (int i=0; i<arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    pos = j;
//                    return arr[pos];
//                }
//            }
//        }
//        return arr[pos];
//        int pos=0;
//        for(int i=pos+1;i<arr.length&&pos<arr.length;i++,pos++){
//            if(arr[i]==arr[pos]){
//                return arr[pos];
//            }
//        }
//        return arr[pos];
        int a=arr.length;
        a=a-2;
        int sum=0;
        int sumExpected=(a*(a+1))/2;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum-sumExpected;
    }

    public static void main(String[] args) {
        int[] arr = ReadArray();
        System.out.print(FindDuplicate(arr));

    }
}
