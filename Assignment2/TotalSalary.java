package Codezen_Codes.Assignment2;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int basic=s.nextInt();
        char c=s.next().charAt(0);
        int allow=0;
        if(c=='A'){
            allow=1700;
        }
        else if(c=='B'){
            allow=1500;
        }
        else{
            allow=1300;
        }
        double hra=  (0.2*basic);
        double da=  (0.5*basic);
        double pf= (0.11*basic);
        double total=basic+hra+da+allow-pf;
        System.out.print((int)total);
    }
}
