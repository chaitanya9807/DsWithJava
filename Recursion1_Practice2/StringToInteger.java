package Codezen_Codes.Recursion1_Practice2;

import java.util.Scanner;

public class StringToInteger {
    public static Scanner s = new Scanner(System.in);

//    public static int StrigChange(String str, int sum) {
//        if (str.length() == 0) {
//            return sum / 10;
//        }
//        int b = Character.getNumericValue(str.charAt(0));
//        sum += b;
//        return StrigChange(str.substring(1), sum * 10);
//    }
    public static int StrigChange(String str){
        if(str.length()==0){
            return 0;
        }
        int sum=StrigChange(str.substring(1));
        sum+=Character.getNumericValue(str.charAt(0))*Math.pow(10,str.length()-1);
        return sum;
    }

    public static void main(String[] args) {
//        System.out.print(StrigChange(s.nextLine(), 0));
        System.out.print(StrigChange(s.nextLine()));
    }
}