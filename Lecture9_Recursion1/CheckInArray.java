package Lecture9_Recursion1;

import java.util.Scanner;

public class CheckInArray {
    public static Scanner s = new Scanner(System.in);
    public static boolean check(int[] arr,int element,int sI){
        if(sI==arr.length){
            return false;
        }
        if(arr[sI]==element){
            return true;
        }
        else{
            return check(arr,element,sI+1);
        }
    }
    public static void main(String[] args){
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int element=s.nextInt();
        System.out.print(check(arr,element,0));
    }
}
