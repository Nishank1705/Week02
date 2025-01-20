import java.util.*;
class HotelBookingSystem{
    String guestName;
    String roomType; 
    int nights;
    //Default 
    public HotelBookingSystem(){
     String guestName = "Unknown";
     String roomType = "Normal";
     int nights = 1;
    } 
    public HotelBookingSystem(String guestName,String roomType,int nights){
    this.guestName=guestName;
    this.roomType=roomType;
    this.nights=nights;
    }
    public HotelBookingSystem(HotelBookingSystem object2){
        this.guestName=object2.guestName;
        this.roomType=object2.roomType;
        this.nights=object2.nights;
    }
    void display(){
        System.out.println("Name is "+ guestName+ " roomtype is "+roomType+" nights are "+nights);
    }
}
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Getting input from the user
        System.out.println("Enter customer name");
        String guestName =sc.nextLine();
        System.out.println("Enter roomtype normal or Suite");
        String roomType =sc.nextLine();
        System.out.println("enetr number of nights you will be staying");
        int nights=sc.nextInt();

        HotelBookingSystem object1=new HotelBookingSystem();
        object1.display();
        HotelBookingSystem object2 = new HotelBookingSystem(guestName, roomType,nights);
        object2.display();
        HotelBookingSystem object3 = new HotelBookingSystem(object2);
        object3.display();
    }
    
}
