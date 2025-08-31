package javalabs;

import java.util.Scanner;
import loppingStmts.PerfNUm2nd;
public class lab29072025_02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a start number :");
        int start=sc.nextInt();
        System.out.println("enter the ending numnber :");
        int end=sc.nextInt();
        PerfNUm2nd obj=new PerfNUm2nd();
        obj.range(start,end);
        sc.close();
    }
    
}
