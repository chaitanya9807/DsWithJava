package Codezen_Codes.Assignment2;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int i=1;
        int p=1;
        while(i<=n){
            p=p*m;
            i++;
        }
        System.out.print(p);
    }
}
