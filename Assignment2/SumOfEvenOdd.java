package Codezen_Codes.Assignment2;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int even_sum=0;
        int odd_sum=0;
        while(n!=0){
            int t=n%10;
            if(t%2==0){
                even_sum+=t;
            }
            else{
                odd_sum+=t;
            }
            n=n/10;
        }
        System.out.print(even_sum+" "+odd_sum);
    }
}
