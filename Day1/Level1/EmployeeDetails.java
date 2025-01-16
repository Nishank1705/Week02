 //declaring employee class
    class Employee{
    String name;
    int id;
    double salary;
//constructor
    public Employee( String name,int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    //method to display information
    public void DisplayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + id);
        System.out.println("Employee salary: " + salary);

    }
 }
 //main method 
 public class EmployeeDetails{
    public static void main(String args[]){
        Employee object = new Employee("Tikesh Kardate", 012345, 450000);
        object.DisplayDetails(); //calling display method
    }
 }