package Exception;
import java.util.Scanner;

// Create a simple Bank account system → if withdrawal > balance, throw InsufficientBalanceException.
public class BankAccount {
    static double balance =1000;
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        double amt=0;
        while(true){
            System.out.println("1.deposit account");
            System.out.println("2.withdraw amount");
            System.out.println("3.Display the balance");
            System.out.println("4.exit apllication");
            System.out.println("enter yoiur choice :");
            int tnx = sc.nextInt();
            if(tnx!=3){
            System.out.println("enter the amount :");
            amt = sc.nextDouble();
            }
            try{
                switch(tnx){
                    case 1->deposit(amt);
                    case 2->{
                            try{
                            withdraw(amt);
                        }
                        catch (InsufficientBalanceException e){
                            System.out.println("insufficient balance");
                        }
                    }
                    case 3->System.out.println("the balance:"+balance);
                    case 4->{
                        System.out.println("existing");
                        return;
                    }
                    default->System.out.println("Invalid input");
                }
            }catch(Exception e){
                System.out.println("caught exception");
                e.printStackTrace();
            }
            finally{
                
            }
        }

    }
    static void deposit(double amount){
        balance+=amount;
        System.out.println("Successfully deposited amount");
    }
    static void withdraw(double amount)throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Insuffient balance in the account: "+balance);
        }
        else{
            balance-=amount;
        }

    }
}
