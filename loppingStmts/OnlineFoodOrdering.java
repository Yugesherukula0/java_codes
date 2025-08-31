package loppingStmts;
/*Design and implement a Java application that simulates an online food ordering system. 
The program should perform the following tasks:
Display Food Categories
Prompt the user to select a food category: South Indian 2. North Indian 3. Chinese
Menu Items Based on Category:
For each selected category, display 3 menu items with their prices and ask the user to select one
Order Quantity: Ask the user to enter the quantity of the selected item.
Apply Offers (Nested IT Conditions)
If quantity is 3 or more, apply a 220 combo offer
If quantity is 2. apply a 10 discount
No discount for quantity 1.
Billing & Output:
Calculate and display
Selected item name
> Quantity
> Total bill after applying disce */

import java.util.Scanner;

public class OnlineFoodOrdering {
    double price;
    public static Scanner sc = new Scanner(System.in);

    OnlineFoodOrdering(){
        System.out.println("welcome to the Ganesh food Delivery");
        System.out.println("items type: southindian,northindian,chinese");
    }
    public static void main(String[] args) {
        OnlineFoodOrdering foodorder=new OnlineFoodOrdering();
        System.out.println("Enter the food Category you want :");
        String category = sc.nextLine();
        foodorder.foodCategory(category);
    }
    public void foodCategory(String category){
        switch(category){
            case "southindian":{
                southindian(25,20,25);
                break;
            }
            case "northindian":{
                northindian(219,199,149);
                break;

            }
            case "chinese":{
                chinese();
                break;

            }
            default:
            System.out.println("select the correct food category to place order");
        }
    } 
    void southindian(double stddosaprice,double stdidlyprice,double stdvadaprice){
        int qty=0;
        double dosaprice=0,idlyprice=0,vadaprice=0,totalprice;
        System.out.println("Items available(dosa/idly/vada)");
        System.out.println("Enter the item required :");
        String southitem=sc.nextLine();
        if(southitem.equalsIgnoreCase("dosa")){
            System.out.println("enter the quantity required :");
            int quantity=sc.nextInt();
            qty=quantity;
            dosaprice=quantity*stddosaprice;
        }
        else if(southitem.equalsIgnoreCase("idly")){
            System.out.println("enter the quantity required :");
            int quantity=sc.nextInt();
            qty=quantity;
            idlyprice=quantity*stdidlyprice;
        }
        else if(southitem.equalsIgnoreCase("vada")){
            System.out.println("enter the quantity required :");
            int quantity=sc.nextInt();
            qty=quantity;
            vadaprice=quantity*stdvadaprice;
        }
        else{
            System.out.println("sorry wrong entry !! please enter corrrect entry to place order ");
        }
        totalprice=dosaprice+idlyprice+vadaprice;
        if (qty==2){
            totalprice-=10;
        }
        else if(qty>=3){
            totalprice-=20;
        }
        System.out.println("price after the discount : "+totalprice);
    }
    void northindian(double StdCtandooriPrice,double stdchanaMasalPrice,double stdpalakpannerPrice){

    }
    void chinese(){

    }
}
