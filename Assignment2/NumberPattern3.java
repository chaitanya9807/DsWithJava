package Codezen_Codes.Assignment2;

/*
    1
    11
    121
    1221

 */

import java.util.Scanner;

public class NumberPattern3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("1");
        int i=2;
        while(i<=n){
            int count=1;
            while(count<=i){
                if(count==1||count==i){
                    System.out.print("1");
                }
                else{
                    System.out.print("2");
                }
                count++;
            }
            i++;
            System.out.println();
        }
    }
}
