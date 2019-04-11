package Lecture2_Patterns;

import java.util.Scanner;

public class Sum1toN {
    public static void main(String[] args){
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N:");
        int n=sc.nextInt();
        int sum=0;
        while(i<=n){
            int a=sc.nextInt();
            sum=sum+a;
            i++;
        }
        System.out.println("\nSum is:"+sum);

    }
}
