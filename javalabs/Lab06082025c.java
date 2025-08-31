package javalabs;

import java.util.Scanner;

import loppingStmts.forloopmethods;

public class Lab06082025c {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number :");
        int num=sc.nextInt();
        forloopmethods obj= new forloopmethods();
        if(obj.isNeonNumber(num)){
            System.out.println("the given number is neon number ");
        }
        else{
            System.out.println("the given number is not neon number ");
        }
        sc.close();
    }
}
