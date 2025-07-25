package loppingStmts;

import java.util.Scanner;

public class printnums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        printNums(num);
    }
    public static void printNums(int num){
        if (num<=10){
            System.out.println(num);
            printNums(num+=1);
        }

    }
    
}
