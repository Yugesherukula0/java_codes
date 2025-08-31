package javalabs;
import java.util.Scanner;

import loppingStmts.FIndevenandOddnumsCnt;
public class lab29072025 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        FIndevenandOddnumsCnt check=new FIndevenandOddnumsCnt();
        check.numberDigits(num);
        check.display();
        sc.close();
    }
}
