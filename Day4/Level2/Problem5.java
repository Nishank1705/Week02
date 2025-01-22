import java.util.ArrayList;

class Course {
    String name;
    Professor professor;
    ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.name + " assigned to course " + name);
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Student " + student.name + " enrolled in course " + name);
        }
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + name);
        if (professor != null) {
            System.out.println("Taught by: " + professor.name);
        }
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println(student.name);
        }
        System.out.println();
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

class Professor {
    String name;

    public Professor(String name) {
        this.name = name;
    }
}

public class Problem5 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Professor professor1 = new Professor("Dr. Abhay");
        Professor professor2 = new Professor("Dr. Nishank");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Computer Science");

        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);

        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}