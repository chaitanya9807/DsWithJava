package Codezen_Codes.Recursion1_Practice1;

import java.util.Scanner;

public class Palindrome {
    public static boolean IsPalindrome(String str,int sI,int eI,boolean flag){
        if(sI>eI){
            return true;
        }
        if(str.charAt(sI)!=str.charAt(eI)){
            return false;
        }
        flag=IsPalindrome(str,sI+1,eI-1,flag);
        return flag;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        System.out.print(IsPalindrome(str,0,str.length()-1,true));
    }
}