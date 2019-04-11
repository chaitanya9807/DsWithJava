package Codezen_Codes.StringsAnd2DArrays;

import java.util.Scanner;

public class HighestOccuringChar {
    public static Scanner s = new Scanner(System.in);
    public static char highest(String str){
        int max=Integer.MIN_VALUE,count=1;
        char c=' ';
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                }
            }
            if(count>max){
                max=count;
                c=str.charAt(i);
            }
        }
        return c;
    }
    public static void main(String[] args){
        String str=s.nextLine();
        System.out.print(highest(str));
    }
}
