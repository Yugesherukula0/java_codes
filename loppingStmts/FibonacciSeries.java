package loppingStmts;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number :");
        int num=sc.nextInt();
        findFibonacciSeries(num);
        sc.close();
    }
    static void  findFibonacciSeries(int num){
        int n1=0;
        int n2=1;
        int sum;
        for(int i=0;i<=num;i++){
            sum=n1+n2;
            System.out.print(sum+" "); 
            n1=n2; 
            n2=sum;   
        }
    }
}
