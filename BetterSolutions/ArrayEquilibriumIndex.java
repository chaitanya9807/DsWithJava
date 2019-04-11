package Codezen_Codes.BetterSolutions;

import java.util.Scanner;

public class ArrayEquilibriumIndex {
    public static Scanner s = new Scanner(System.in);

    public static int[] ReadArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int arrayEqui(int[] arr, int sI) {
//        if (sI >= arr.length) {
//            return -1;
//        }
//        int sum1 = 0, sum2 = 0;
//        for (int i = 0; i < sI; i++) {
//            sum1 += arr[i];
//        }
//        for (int i = sI + 1; i < arr.length; i++) {
//            sum2 += arr[i];
//        }
//        if (sum1 == sum2) {
//            return sI;
//        } else {
//            return arrayEqui(arr, sI + 1);
//        }
        int sum1=0,sum2=0;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                sum1+=arr[j];
            }
            for(int j=i+1;j<arr.length;j++){
                sum2+=arr[j];
            }
            if(sum1==sum2){
                return i;
            }
            else{
                sum1=0;
                sum2=0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = ReadArray();
        System.out.print(arrayEqui(arr, 0));
    }
}
