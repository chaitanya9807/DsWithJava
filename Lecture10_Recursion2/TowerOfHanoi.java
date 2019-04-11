package Lecture10_Recursion2;

import java.util.Scanner;

public class TowerOfHanoi {
    public static Scanner s = new Scanner(System.in);

    public static void tOH(int disk,char source,char aux,char destination){
        if(disk==0){
            return;
        }
        tOH(disk-1,source,destination,aux);
        System.out.println(source+" "+destination);
        tOH(disk-1,aux,source,destination);
    }
    public static void main(String[] args){
        int n=s.nextInt();
        tOH(n,'a','b','c');
    }
}
