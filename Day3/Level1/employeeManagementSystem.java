
class Employee{
    static String companyName = "CapGPT";
    static int count;
    String name;
    final int employee_id;
    String designation;
    public Employee(String name, int employee_id,String designation){
        this.name=name;
        this.employee_id=employee_id;
        this.designation=designation;
        count++ ;
    }

    static void displayTotalEmployees(){
        System.out.println("Total number of employee "+ count);
    }
    void displayDetails() {
        System.out.println("Employee name "+ name+ "\nEmployee id "+employee_id+"\nemployee designation "+ designation +"\n");
    }
}
public class employeeManagementSystem {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ram",0001, "Director");
        Employee employee2 = new Employee("Shyam",0002, "manager");
        Employee employee3 = new Employee("Ghanshyam",0003, "Executive");
        if(employee1 instanceof Employee){
            System.out.println("employee 1 is an instance of class Employee");
            employee1.displayDetails();
        }
        if (employee2 instanceof Employee){
            System.out.println("Employee 2 is an object of Employee class");
            employee2.displayDetails();
        }
        if (employee3 instanceof Employee){
            System.out.println("Employee 3 object is an instance of employee class");
            employee3.displayDetails();
        }
        Employee.displayTotalEmployees();
    }
    
}
