package Lecture9_Recursion1;

import java.util.Scanner;

public class FirstOccurence {
    public static Scanner s = new Scanner(System.in);
    public static int First(int[] arr,int element,int sI){
        if(sI==arr.length){
            return -1;
        }
        if(arr[sI]==element){
            return sI;
        }
        else{
            return First(arr,element,sI+1);
        }
    }
    public static void main(String[] args){
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int element=s.nextInt();
        System.out.print(First(arr,element,0));
    }
}
