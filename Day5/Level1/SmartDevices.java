
//parent class
 class Devices{
    int deviceID;
    String status;
    Devices(int deviceID, String status){
        this.deviceID=deviceID;
        this.status=status;
    }
    void displayStatus(){
        //to be overridden in child class
    }
}
//child class
class Thermostat extends Devices{
    String temperatureSetting;
    Thermostat(int deviceID,String status, String temperatureSetting){
        super(deviceID,status);
        this.temperatureSetting=temperatureSetting;
    }
    void displayStatus(){
        System.out.println("Device ID is "+deviceID);
        System.out.println("Device status is "+status);
        System.out.println("Device temperature setting status is "+ temperatureSetting);
    }
} 
//main class
public class SmartDevices{
    public static void main(String[] args) {
        Thermostat object = new Thermostat(8080,"Active","Normal");
        object.displayStatus();
    }
} 