package Lecture2;

import java.util.Scanner;

public class maximum_of_N {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N:");
        int n=sc.nextInt();
        int i=2;
        System.out.print("\nEnter the integers:");
        int a=sc.nextInt();
        int max=a;
        while(i<=n){
            a=sc.nextInt();
            if(a>max){
                max=a;
            }
            i++;
        }
        System.out.print("\nMaximum number entered is:"+max);
    }
}
