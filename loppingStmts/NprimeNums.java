package loppingStmts;

/*Write a Java program that takes an integer N as input and prints the first N prime numbers.
   For example,
  -> If the input is 2, the output should be 2 3.
  -> If the input is 5, the output should be 2 3 5 7 11.*/
  
import java.util.Scanner;
public class NprimeNums{
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range(number) of prime numbers :");
        int limit=sc.nextInt();
        for(int i=1; ;i++){
           if(isPrime(i)){
               count++;
               if(count <limit){
               System.out.print(i+" ");
               }
           }
        sc.close();
        }
        
    }
    public static boolean isPrime(int num){
        boolean status =true;
        if (num==1){
            status=false;
            return status;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                status=false;
                break;
            }
        }
        return status;
    }
}