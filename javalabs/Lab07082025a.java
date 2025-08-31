package javalabs;
/* "Find all prime numbers between 1 and 100. Then, print only those prime numbers that are at even index positions (i.e., 0, 2, 4, ... based on their position in the prime list)."

📌 Example:
Prime list = [2, 3, 5, 7, 11, 13, ...]
Even index primes = 2, 5, 11, ...*/
import java.util.Scanner;

import loppingStmts.forloopmethods;

public class Lab07082025a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        forloopmethods obj=new forloopmethods();
        obj.findEvenIndexPriNums();
        sc.close();
    }
   
    
}
