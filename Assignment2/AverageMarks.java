package Codezen_Codes.Assignment2;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        int m1=s.nextInt();
        int m2=s.nextInt();
        int m3=s.nextInt();
        int sum=0;
        int flag=0;
        if(m1>=m2 && m1>=m3){
            sum+=m1;
        }
        else if(m2>=m1 && m2>=m3){
            sum+=m2;
            flag=1;
        }
        else{
            sum+=m3;
            flag=-1;
        }
        if(flag==0){
            if(m2>m3){
                sum+=m2;
            }
            else{
                sum+=m3;
            }
        }
        else if(flag==1){
            if(m1>m3){
                sum+=m1;
            }
            else{
                sum+=m3;
            }
        }
        else{
            if(m1>m2){
                sum+=m1;
            }
            else{
                sum+=m2;
            }
        }
        System.out.print(c+" "+sum/2);
    }
}
