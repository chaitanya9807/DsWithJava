package Codezen_Codes.Assignment3;

import java.util.Scanner;

public class CheckNumberSequence {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int flag=0;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                if(flag==0){
                    continue;
                }
                else{
                    flag=2;
                    break;
                }
            }
            else if(arr[i]<arr[i+1]){
                flag=1;
                continue;
            }
        }
        if(flag==2){
            System.out.print("false");
        }
        else{
            System.out.print("true");
        }
    }
}
