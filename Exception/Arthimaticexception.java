package Exception;

import java.util.Scanner;

class Arthimaticexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a value :");
        int a=sc.nextInt();
        System.out.println("Enter the b value ");
        int b= sc.nextInt();
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.err.println("Error dividing by Zero is Not Possible");
        }
        sc.close();
    }
    
}