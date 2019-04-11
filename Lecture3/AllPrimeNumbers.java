package Codezen_Codes.Lecture3;

import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int flag=0;
        for(int j=2;j<=n;j++){
            flag=0;
            for(int i=2;i<j;i++){
                if(j%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(j);
            }
        }
    }
}
