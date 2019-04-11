package Codezen_Codes.Assignment2;

import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("1");
        int i=2;
        while(i<=n){
            int count=1;
            while(count<=i){
                if(count==1||count==i){
                    System.out.print(i-1);
                }
                else{
                    System.out.print("0");
                }
                count++;
            }
            i++;
            System.out.println();
        }
    }
}
