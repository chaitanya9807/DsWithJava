package Codezen_Codes.Recursion_1;

import java.util.Scanner;

public class AllIndices {
    public static Scanner s = new Scanner(System.in);

    public static int[] ReadArray() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int[] AllIndex(int[] arr,int element,int sI,int[] arr1,int I){
        if(sI==arr.length){
            return arr1;
        }
        if(arr[sI]==element){
            arr1[I]=sI;
            I++;
        }
        arr1=AllIndex(arr,element,sI+1,arr1,I);
        return arr1;
    }
    public static void main(String[] args){
        int[] arr=ReadArray();
        int element=s.nextInt();
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                c++;
            }
        }
        int[] arr1=new int[c];
        int[] arr2=AllIndex(arr,element,0,arr1,0);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
