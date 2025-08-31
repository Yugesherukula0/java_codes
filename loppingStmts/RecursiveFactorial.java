package loppingStmts;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num=sc.nextInt();
        int fact=findFactorial(num);
        System.out.println(fact);
        sc.close();
    }
    static int findFactorial(int num){
        if(num==0){
            return 1;
        }
        else
        return num*findFactorial(num-1);
    }
}
