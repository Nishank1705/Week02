/*Program to Compute Area of a Circle
Problem Statement: Write a program to create 
a Circle class with an attribute radius.
 Add methods to calculate and display the area and circumference of the circle. */



class Circle{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public double circumference(){
        return 2*3.14*radius;
    }
}
public class AreaOfCircle {
    public static void main(String args[]) {
    Circle object=new Circle(5);
    System.out.println("Area of circle is "+ object.area());
    System.out.println("Circumference of circle is "+ object.circumference());

}
}