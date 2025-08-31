package loppingStmts;

import java.util.Scanner;

public class FactorialOfNumber {
    static int factorial=1;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to find factorial :");
        int fact=sc.nextInt();
        if (fact>0){
            int result=factorialofNumber(fact);
            System.out.println("factorial of given number is :"+result);
        }
        else
        System.out.println("enter correct input");
        sc.close();
    }

    private static int factorialofNumber(int fact) {
        for(int i=fact;i>0;i--){
            factorial*=fact;
        }
        System.out.println("factorial :"+factorial);
        return factorial;
    }
}
