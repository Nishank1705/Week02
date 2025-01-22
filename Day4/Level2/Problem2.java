import java.util.ArrayList;

class Faculty {
    String name;

    public Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;

    public Department(String name) {
        this.name = name;
    }
}

class University {
    String name;
    ArrayList<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println(department.name);
        }
        System.out.println();
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Faculty faculty1 = new Faculty("Dr. Abhay");
        Faculty faculty2 = new Faculty("Dr. Nishank");

        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Electronics");

        University university = new University("Global University");
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        university.displayDepartments();

        System.out.println("Faculty members:");
        System.out.println(faculty1.name);
        System.out.println(faculty2.name);

        university = null;
        System.out.println("University and its departments deleted.");
    }
}