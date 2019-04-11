package Codezen_Codes.Arrays1_Practice;

import java.util.Scanner;

public class TripletSum {
    public static Scanner s = new Scanner(System.in);
    public static int[] ReadArray() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static void SumTriplet(int[] arr,int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    int n=arr[i]+arr[j]+arr[k];
                    if(n==sum){
                        if(arr[k]<arr[i]&&arr[k]<arr[j]){
                            System.out.print(arr[k]+" ");
                            if(arr[i]<arr[j]){
                                System.out.println(arr[i]+" "+arr[j]);
                            }
                            else{
                                System.out.println(arr[j]+" "+arr[i]);
                            }
                        }
                        else if(arr[i]<arr[j]&&arr[i]<arr[k]){
                            System.out.print(arr[i]+" ");
                            if(arr[k]<arr[j]){
                                System.out.println(arr[k]+" "+arr[j]);
                            }
                            else{
                                System.out.println(arr[j]+" "+arr[k]);
                            }
                        }
                        else{
                            System.out.print(arr[j]+" ");
                            if(arr[i]<arr[k]){
                                System.out.println(arr[i]+" "+arr[k]);
                            }
                            else{
                                System.out.println(arr[k]+" "+arr[i]);
                            }
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr=ReadArray();
        int sum=s.nextInt();
        SumTriplet(arr,sum);
    }
}
