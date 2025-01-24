
import java.time.LocalDate;
class Orders{
    int orderID;
    int date;
    Orders(int orderID, int date){
        this.orderID=orderID;
        this.date=date;
    }
    void getOrderStatus(){
        System.out.println("Order placed with date and order ID as \n"+ orderID+"\n"+date);
        //to be overridden
    }
    
} 
//first child class
class ShippedOrder extends Orders{
    int trackingNumber;
    ShippedOrder(int orderID,int date,int trackingNumber){
        super(orderID, date);
        this.trackingNumber=trackingNumber;
    }
    @Override
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Tracking number is "+ trackingNumber);
    }
}
// second child class
class DeliveredOrder extends ShippedOrder{
    int deliveryDate;
    DeliveredOrder(int orderID, int date,int trackingNumber, int deliveryDate){
        super(orderID, date,trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    @Override
    void getOrderStatus(){
        super.getOrderStatus();
        System.out.println("Expected Delivery Date is "+deliveryDate);
    }
}
public class OrderDetails{
    public static void main(String[] args) {
        Orders object1 = new Orders(788,20);
        //LocalDate specificDate = LocalDate.of(2025, 1, 24);
        object1.getOrderStatus();
        Orders object3 = new ShippedOrder(788, 20,8999);
        object3.getOrderStatus();
        Orders object2 = new DeliveredOrder(788, 20, 8999, 30);
        object2.getOrderStatus();
        

    }
}

