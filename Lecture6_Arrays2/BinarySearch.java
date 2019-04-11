package Lecture6_Arrays2;

import java.util.Scanner;

public class BinarySearch {
    public static Scanner s = new Scanner(System.in);
    public static int[] ReadArray(){
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static int BinarySearch(int[] arr,int element){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==element){
                return mid;
            }
            else if(element<arr[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr=ReadArray();
        int element=s.nextInt();
        int pos=BinarySearch(arr,element);
        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println(pos);
        }
    }
}
