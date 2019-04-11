package Codezen_Codes.Recursion1_Practice1;

import java.util.Scanner;

public class CountZeros {
    public static int ZeroesIn(int a,int c){
        int n=0;
        if(a==0){
            return 0;
        }
        if(a%10==0){
            n++;
        }
        n+=ZeroesIn(a/10,c);
        return n;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        System.out.print(ZeroesIn(a,0));
    }
}
