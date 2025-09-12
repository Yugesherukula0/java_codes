import java.util.InputMismatchException;
import java.util.Scanner;

public class Hallow_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n=0;
        try{
         n=sc.nextInt();
        }catch(InputMismatchException e){
            System.err.println("Enter the correct value");
            e.printStackTrace();
        }
        hallowTriangle(n);
        sc.close();
    }
    static void hallowTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1 || k==i || i==n){
                System.out.print("*"+" ");
                }
                else{
                System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
    
}
