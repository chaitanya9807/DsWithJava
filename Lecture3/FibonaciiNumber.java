package Codezen_Codes.Lecture3;

import java.util.Scanner;

public class FibonaciiNumber {
    public static boolean CheckFibonacii(int n){
        if(n<=0){
            return false;
        }
        else if(n==1){
            return true;
        }
        else{
            int f=1,s=1;
            for(int i=2;i<=n;i++){
                int c=f+s;
                if(n==c){
                    return true;
                }
                f=s;
                s=c;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        boolean b=CheckFibonacii(n);
        System.out.print(b);
    }
}
