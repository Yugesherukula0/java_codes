import java.util.InputMismatchException;
import java.util.Scanner;

public class Hallow_Diamond {
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
        hallowdiamond(n);
        sc.close();
    }
    static void hallowdiamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1 || k==i ){
                System.out.print("*"+" ");
                }
                else{
                System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<n;k++){
                if(k==i || k==n-1){
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