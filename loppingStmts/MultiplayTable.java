package loppingStmts;

import java.util.Scanner;

public class MultiplayTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number for table :");
        int num=sc.nextInt();
        System.out.println("********************");
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
        System.out.println("********************");
        sc.close();;
    }
    
}
