
//parent class
class Employee{
    String name;
    int id;
    double salary;
    public Employee(String name, int id, double salary){
        this.name= name;
        this.id=id;
        this.salary=salary;
    }
    void displayDetails(){
     //will be overriden
    }
}
//Child class
class Manager extends Employee{
    int teamsize;
    Manager(String name, int id, double salary, int teamsize){
        super(name, id, salary);
        this.teamsize= teamsize;
    }
    @Override
    void displayDetails() {
        System.out.println("Employee name= "+ name);
        System.out.println("Employee id= "+id);
        System.out.println("Employee salary = Rs"+ salary);
        System.out.println("Team size for manager is "+teamsize);
       // super.displayDetails();
    }
}
//child class developer
class Developer extends Employee{
    String language;
    Developer(String name, int id, double salary, String language){
        super(name, id, salary);
        this.language=language;
        
    }
    @Override
    void displayDetails() {
        System.out.println("Employee name= "+ name);
        System.out.println("Employee id= "+id);
        System.out.println("Employee salary = Rs"+ salary);
        System.out.println("Language of Developer is "+language);

}
}
//child class Intern
class Intern extends Employee{
    int durationInMonths;
    Intern (String name, int id, double salary, int durationInMonths){
        super(name, id,salary);
        this.durationInMonths=durationInMonths;
    }
    @Override
    void displayDetails() {
        System.out.println("Intern name= "+ name);
        System.out.println("Intern id = "+id);
        System.out.println("Intern salary = Rs"+ salary);
        System.out.println("Duration of internship in months is "+durationInMonths);

}
}
//main class
public class EmployeeInfo {
    public static void main(String[] args) {
        //making objects
        Manager managerObj= new Manager("Geet",8977,80000.00,70);
        managerObj.displayDetails();
        Developer dev = new Developer("Heet",890,800000,"python");
        dev.displayDetails();
        Intern intern=  new Intern("Meet", 111, 9000, 6);
        intern.displayDetails();
    }
}
