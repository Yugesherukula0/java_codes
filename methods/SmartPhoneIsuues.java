/*Design and implement a Java application that assists users in identifying and resolving common smartphone issues. 
The system should be interactive, guiding the user through a series of diagnostic questions depending on the type of issue selected.
Main Menu:
Display the following options to the user:
1. Battery Issues
2. Network Issues
3. App Crashes
4. Storage Issues
5. Exit
Switch-Case Structure:
Use a switch-case construct in the main() method to handle user selection.
Each case must invoke a dedicated method corresponding to the selected issue.
Include break statements after each case to ensure proper control flow.
 > Diagnostic Methods:
  Implement separate methods for each issue category (e.g., handleBatteryIssues(), handleNetworkIssues(), etc.).
  Within each method:
  Prompt the user with one or more yes/no diagnostic questions using the Scanner class.
  Apply if-else logic to interpret the responses and provide helpful suggestions or solutions.
  Exit Option:
  When the user selects option 5, gracefully terminate the program and display an appropriate exit message.*/

package methods;
import java.util.Scanner;

public class SmartPhoneIsuues {
    public static Scanner sc= new Scanner(System.in);
    static{
        System.out.println("welcome to the smart phone serive centre");
    }
    public static void main(String[] args) {
        SmartPhoneIsuues phone= new SmartPhoneIsuues();
        System.out.println("select '1' for Battery Issues");
        System.out.println("select '2' for Network Issues");
        System.out.println("select '3' for App Crashes Issues");
        System.out.println("select '4' for Storage Issues");
        System.out.println("select '5' to exit from application");
        System.out.println("Select the option based on your problem:");
        int operPerform=sc.nextInt();
        switch(operPerform){
        case(1):{
            phone.handleBatteryIssues();
            break;
        }
        case(2):{
            phone.handleNetworkIssues();
            break;
        }
        case(3):{
            phone.handleAppCrashIssue();
            break;
        }
        case(4):{
            phone.handleStorageIssue();
            break;
        }
        case(5):{
            phone.exitFromAppilication();
            break;
        }
        default:{
            System.out.println("Please enter the corresponding number for the Issue");
        }
        }
    }
    public void handleBatteryIssues(){
        System.out.println("Hey hello May i know the type of phone:");
        String typeOfPhone = sc.nextLine();
        System.out.println("do you battery heating too much (yes/no) ?");
        char heatPrblm = sc.next().charAt(0);
        System.out.println("is your phone droping the battery percentage :");
        char dropPent= sc.next().charAt(0);
        if(heatPrblm=='y'){
            System.out.println("do you play heavy games?");
            char hevyGame = sc.next().charAt(0);
            if(hevyGame=='y'){
                System.out.println("please dont play games over time !!");
            }
            else {
                System.out.println("please close unused apps it takes battery away");
                System.out.println("Please decrease your phones's Brightness :");
            }
        }
        else if(dropPent=='y'){
            System.out.println("Please Change the battery");
            
        }
    }
    public void handleNetworkIssues(){
        System.out.println("May i know which network you are using :");
        String network=sc.nextLine();
        System.out.println("is Your network not getting ");

    }
    public void exitFromAppilication(){
        System.out.println("Thanks for visiting");
        System.out.println("Visit Again!!");

    }

    
}
