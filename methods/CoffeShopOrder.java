/*Coffee Shop Order
> You're building a billing system for a coffee shop. 
Each order has item name, quantity, and price per item.
Use a constructor to create an order.
Use a method to calculate total bill.
Use assignment operators to add tax (5%) to the bill.*/

package methods;

public class CoffeShopOrder {
    long orderid;
    String itemName;
    double quantity;
    double price;
    double totalbillprice;
    public CoffeShopOrder(long orderid){
        this.orderid=orderid;
        this.itemName=null;
        this.quantity=0.0;
        this.price=0.0;
    }
    void orderDetails(String itemName,double quantity,double price){
        this.itemName=itemName;
        this.quantity=quantity;
        this.price=price;
    }
    void totalBill(double tax){
        this.totalbillprice=price*quantity;
        this.totalbillprice+=totalbillprice*tax/100;
    }
    public static void main(String[] args) {
        CoffeShopOrder order1 = new CoffeShopOrder(123345);
        order1.orderDetails("cold coffe", 02, 150);
        order1.totalBill(5);
        order1.display();
        
    }
    public void display(){
        System.out.println("Order id :"+orderid);
        System.out.println("item Name :"+itemName);
        System.out.println("Quantity of the item :"+quantity);
        System.out.println("Price of the item :"+price);
        System.out.println("total bill of the items (including :"+totalbillprice);
    }
    
}
