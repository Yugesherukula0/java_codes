// find the first non repeating number from the given number 
//for exmaple 1234321 ouput=4
// if no non repeating num return -1

package javalabs;

import java.util.Scanner;

import loppingStmts.forloopmethods;

public class Lab05082025a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num=sc.nextInt();
        forloopmethods obj=new forloopmethods();
        int nonRepeatNUm=obj.findNonRepeatNumR(num);
        System.out.println(nonRepeatNUm);
        sc.close();

    }
    
}
