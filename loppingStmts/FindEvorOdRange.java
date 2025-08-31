package loppingStmts;
import javalabs.lab28072025;
import java.util.Scanner;
// 2.find how many even numbers and odd numbers present in give range 1 to 100, 
//show only the Even numbers Count and Odd numbers Count using for loop

public class FindEvorOdRange {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lab28072025 obj= new lab28072025();
        System.out.println("enter a starting number :");
        int start=sc.nextInt();
        System.out.println("ente the range Upto which num");
        int end=sc.nextInt();
        obj.evenOddRange(start,end);
        obj.display();
        sc.close();
    }
}
