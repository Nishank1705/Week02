import java.util.*;
class Circle{
    int radius;
    //parameterized constructor
    public Circle(int radius){
    this.radius= radius;
    }
     // Default Constructor
    public Circle(){
    this.radius = 5;
    }
    
    void display(){
    System.out.println(radius);
    }
}
    public class Question2 {
        public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int radius = sc.nextInt();
        Circle object1 = new Circle();
        object1.display();
        Circle object2 = new Circle(radius);
        object2.display();
        }
}
