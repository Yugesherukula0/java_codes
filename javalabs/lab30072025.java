/*1.Write a Java program to display the N-th Prime Number 
(Ex if N=5 then Program should display 11 because 11 is the prime number and 
its in fifth Position in prime numbers sequence ).*/


package javalabs;

import java.util.Scanner;

import loppingStmts.NthPrimeNum;
public class lab30072025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth prime you need");
        int nthNum=sc.nextInt();
        NthPrimeNum num=new NthPrimeNum();
        num.nthPrimeNumber(nthNum);
        sc.close();
    }
}
