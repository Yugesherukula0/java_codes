package javalabs;

import java.util.Scanner;

import loppingStmts.forloopmethods;

public class Lab12082025b {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number :");
        int num=sc.nextInt();
        Lab12082025b obj1=new Lab12082025b();
        obj1.primefactors(num);
       
    }
    void  primefactors(int num){
        forloopmethods obj=new forloopmethods();
        for(int i=1;i<=num/2;i++){
                if(obj.isprimeNum(i)){
                    System.out.println(i);
                    while(num>0){
                        if(num)
                    }
                    }
                }

        }
        

    }
    
}
