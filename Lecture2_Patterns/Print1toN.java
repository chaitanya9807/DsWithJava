package Lecture2_Patterns;

import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args){
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
