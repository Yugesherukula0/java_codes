package loppingStmts;

import java.util.Scanner;
//Print the squares of numbers from 1 to 10.
public class SquareOfNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the starting number :");
        int start=sc.nextInt();
        System.out.println("enter the ending number :");
        int end=sc.nextInt();
        squareOfNumbers(start,end);
//     int result=squareOfNumbers(start,end);
        //System.out.println("SUm of squares :"+result);
        sc.close();
    }
    static void squareOfNumbers(int start,int end){
        for(int i=start;i<=end;i++){
            System.out.print(i*i+" ");
        }
    }
}
