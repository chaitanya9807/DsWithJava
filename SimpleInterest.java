package Lecture2;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal:");
        int p=sc.nextInt();
        System.out.print("\nEnter Rate:");
        int r=sc.nextInt();
        System.out.print("\nEnter Time:");
        int t=sc.nextInt();
        int SI=(p*r*t)/100;
        System.out.print("Simple Interest :"+SI);

    }
}
