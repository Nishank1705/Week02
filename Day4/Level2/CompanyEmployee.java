import java.util.ArrayList;
class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Employees in Department: " + name);
        for (Employee employee : employees) {
            System.out.println(employee.name);
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDepartments() {
        System.out.println("Departments in Company: " + name);
        for (Department department : departments) {
            System.out.println(department.name);
            department.displayEmployees();
        }
    }
}

public class CompanyEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Keshav");
        Employee emp2 = new Employee("Bharat");
        Employee emp3 = new Employee("Abhay");

        Department dept1 = new Department("IT");
        Department dept2 = new Department("HR");

        dept1.addEmployee(emp1);
        dept1.addEmployee(emp2);
        dept2.addEmployee(emp3);

        Company company = new Company("TechCorp");
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        company.displayDepartments();
    }
}