// Superclass Person
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayRole(){
        
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age); // Call to the superclass constructor
        this.subject = subject;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Teacher");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

// Subclass Student
class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age); // Call to the superclass constructor
        this.grade = grade;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}

// Subclass Staff
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age); // Call to the superclass constructor
        this.department = department;
    }

    @Override
    void displayRole() {
        System.out.println("Role: Staff");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Main class to test the system
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating objects of each class
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 45, "Maintenance");

        // Displaying information of each person
        teacher.displayRole();
        teacher.displayInfo();
        System.out.println();

        student.displayRole();
        student.displayInfo();
        System.out.println();

        staff.displayRole();
        staff.displayInfo();
    }
}
