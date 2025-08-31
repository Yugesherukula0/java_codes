/*1.Palindrome Prime – A number that is both prime and palindrome.
(Example: 131, 151)*/


package javalabs;

import java.util.Scanner;

import loppingStmts.forloopmethods;

public class Lab12082025 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number  :");
        int num=sc.nextInt();
        forloopmethods obj= new forloopmethods();
        if(obj.isPaliindromePrime(num)){
            System.out.println("the given number is prime palimdrome number");
        }
        else{
            System.out.println("the number is not prime palindome");
        }
        sc.close();
    }
    
    
}
