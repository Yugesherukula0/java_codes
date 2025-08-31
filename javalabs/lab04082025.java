package javalabs;

import java.util.Scanner;

import loppingStmts.forloopmethods;

public class lab04082025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        forloopmethods obj= new forloopmethods();
        if(obj.harshadNumber(num)){
            System.out.println("The given number is harshad number ");
        }
        else
        System.out.println("The given number is not harshad number");
        sc.close();
    }
    
    
}
