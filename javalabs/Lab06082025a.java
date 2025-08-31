package javalabs;

import java.util.Scanner;

import loppingStmts.forloopmethods;

public class Lab06082025a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        forloopmethods obj=new forloopmethods();
        if(obj.strongNumber(num)==num){
            System.out.println("the number is strong number");
        }
        else{
            System.out.println("the number is not strong number");
        }
        sc.close();
    }
}
