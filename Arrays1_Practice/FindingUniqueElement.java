package Codezen_Codes.Arrays1_Practice;

import java.util.Scanner;

public class FindingUniqueElement {
    public static int[] ReadArray() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int FindUnique(int[] arr) {
//        int pos = -1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] == arr[i]) {
//                    break;
//                } else {
//                    pos = i;
//                }
//            }
//        }
//        return arr[pos];
        int k=arr.length;
        for(;k>1;k-=2){
            int pos=-1;
            for(int j=1;j<k;j++){
                if(arr[0]==arr[j]){
                    pos=j;
                    break;
                }
            }
            if(pos==-1){
                return arr[0];
            }
            else{
                for(int i=0;i<pos-1;i++){
                    arr[i]=arr[i+1];
                }
                for(int j=pos;j<k-1;j++){
                    arr[j]=arr[j+1];
                }
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int[] arr = ReadArray();
        int unique = FindUnique(arr);
        System.out.print(unique);
    }
}
