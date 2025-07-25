/*
Bank Account Setup
> When a user creates a bank account:
A static block should run to display "Welcome to XYZ Bank".
A constructor should initialize name, accountNo, and balance.
A method deposit(amount) should increase balance using +=.
A method withdraw(amount) should decrease balance using -=
*/

package methods;
public class BankAccSetUp {
    String costumerName;
    static long accountNO;
    double curentBalance;
    static{
        System.out.println("Welcome to XYZ Bank");
    }
    public BankAccSetUp(String costumerName,
    long accountNO,
    double currentBalance){
        this.costumerName=costumerName;
        BankAccSetUp.accountNO=accountNO;
        this.curentBalance=currentBalance;
    }
    void debitAmount(double deductedamt){
        this.curentBalance-=deductedamt;
    }
    void creditAmount(double creditedamt){
        this.curentBalance+=creditedamt;
    }

    public static void main(String[] args) {
        BankAccSetUp acc1 = new BankAccSetUp("patrick", 8765432345678L, 2456.89);
        acc1.debitAmount(23.56);
        acc1.creditAmount(567.83);
        acc1.displayDetails();

        
    }
    public void displayDetails(){
        System.out.println("Account holder name :"+costumerName);
        System.out.println(costumerName+"'s Account Number :"+accountNO);
        System.out.println("Current Balance in the Account :"+curentBalance);
    }
}
