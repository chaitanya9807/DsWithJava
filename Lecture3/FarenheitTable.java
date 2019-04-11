package Codezen_Codes.Lecture3;
;
import java.util.Scanner;

public class FarenheitTable {
    public static void PrintTable(int S,int E,int W){
        for(int i=S;i<=E;i+=W){
            System.out.println(i+"\t"+(i-32)*(5/9));
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int S=s.nextInt();
        int E=s.nextInt();
        int W=s.nextInt();
        PrintTable(S,E,W);
    }
}
