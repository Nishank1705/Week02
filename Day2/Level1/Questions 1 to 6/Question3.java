class Person{
    String name;
    int age;

    // Default constructor
     public Person() { 
    this.name = "Unknown"; 
    this.age = 0; 
    }
    //parameterized constructor
    public Person(String name,int age){
        this.name= name;
        this.age=age;
    }
    //copy constructor
    public Person(Person object1){
        this.name=object1.name;
        this.age=object1.age;
    }
    void display(){
        System.out.println("Name is "+ name+" and age is "+age);
    }
}
public class Question3 {
    public static void main(String[] args) {
        Person object1=new Person("Mayank",55);
        object1.display();
        Person object2=new Person(object1);
        object2.display();
    }
}
