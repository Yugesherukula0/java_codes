package conditionalStmts;

import java.util.Scanner;

public class HumanLifeChanges {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age of the person :");
        int age=sc.nextInt();
        if(age>=0){
            if(age<=5){
                System.out.println("you are belongs to kids");
            }
            else if(age<=12)
            System.out.println("you are belongs to children age");
            else if(age<=19)
            System.out.println("you are belongs teengae");
            else if(age<=35)
            System.out.println("you are belong to young age");
            else if(age<=60)
            System.out.println("you are belong to middle age");
            else if (age>60)
            System.out.println("you are old age");
        }
        else{
            System.out.println("enter the valid years");
        }
        sc.close();
    }
    
}
