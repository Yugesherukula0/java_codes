package loppingStmts;

import java.util.Scanner;
//Count the number of digits in a number.
public class CountnoofDigits {
    static int temp,count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        int count=countNoOfDigits(num);
        System.out.println("count :"+count);
        sc.close();
    }

    public static int countNoOfDigits(int num) {
        if(num>0){
            temp=num%10;
            count+=1;
            num=num/10;
            countNoOfDigits(num);

        }
        else{
            System.out.println("enter the correct input");
        }
        return count;
    }
}
