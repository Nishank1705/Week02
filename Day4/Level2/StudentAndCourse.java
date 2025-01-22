import java.util.ArrayList;

class Course {
    String name;
    ArrayList<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollCourse(this);
        }
    }

    public void displayStudents() {
        System.out.println("Students enrolled in course: " + name);
        for (Student student : enrolledStudents) {
            System.out.println(student.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void displayCourses() {
        System.out.println("Courses enrolled by student: " + name);
        for (Course course : courses) {
            System.out.println(course.name);
        }
    }
}

class School {
    String name;
    ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void displayStudents() {
        System.out.println("Students in school: " + name);
        for (Student student : students) {
            System.out.println(student.name);
        }
    }
}

public class StudentAndCourse {
    public static void main(String[] args) {
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Student raghu = new Student("Raghu");
        Student deepak = new Student("Deepak");
        Student sonu = new Student("Sonu");
        Student sid = new Student("Sid");
        Student abhay = new Student("Abhay");

        School school = new School("Saraswati Shishu Mandir School");
        school.addStudent(raghu);
        school.addStudent(deepak);

        math.enrollStudent(sonu);
        math.enrollStudent(sid);
        science.enrollStudent(abhay);

        school.displayStudents();

        alice.displayCourses();
        bob.displayCourses();

        math.displayStudents();
        science.displayStudents();
    }
}