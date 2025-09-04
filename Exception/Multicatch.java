package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multicatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter a number ");
            int a=sc.nextInt();
            System.out.println(a/0);

        } catch (InputMismatchException e) {
            
            System.err.println("Enter the integer number ");
        }
        catch(ArithmeticException ae){
            System.out.println("Cant divide a number by zero");

        }
        sc.close();
        System.out.println("main method ended");
    }
}
