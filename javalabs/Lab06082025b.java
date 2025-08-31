package javalabs;

import java.util.Scanner;

import loppingStmts.forloopmethods;

public class Lab06082025b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int num=sc.nextInt();
        forloopmethods obj= new forloopmethods();
        if(obj.isSpyNumber(num)){
            System.out.println("Given number is Spy Number :");
        }
        else{
            System.out.println("Given number is not Spy Number");
        }
        sc.close();
    }
}
