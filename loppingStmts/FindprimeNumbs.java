package loppingStmts;

import java.util.Scanner;
//1.Find Prime Numbers in Given Range 10-50 Using ForLoop
public class FindprimeNumbs {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter a starting number :");
        int start=sc.nextInt();
        System.out.println("enter the upto range :");
        int end =sc.nextInt();
        findPrimenums(start,end);
        
    }
    static void findPrimenums(int start,int end){
        for(int i=start;i<=end;i++){
            int count=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    count+=1;
                }
            
            }
            if(count==1)
                System.out.print(i+" ");
        }


    }

    
}
