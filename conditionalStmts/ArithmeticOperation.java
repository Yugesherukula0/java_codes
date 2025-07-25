package conditionalStmts;

import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number :");
        int num1=sc.nextInt();
        System.out.println("enter b number :");
        int num2=sc.nextInt();
        sc.nextLine();
        System.out.println("ENter the operation to be performed");
        String oper=sc.nextLine();
        double result=0;
        switch(oper){
            case "+"->
            result+=(num1+num2);
            case "-"->
            result=num1-num2;
            case "*"->
            result=num1*num2;
            case "/"->
            result=num1/num2;
            case "%"->
            result=num1%num2;
            default->
            System.err.println("enter the correct input");
        }
        System.out.println("result is :"+result);
    }
}
