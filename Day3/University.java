class Student {
    static String universityName = "Students' University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

   public Student(String name, int rollNumber, String grade) {
       this.name = name;
       this.rollNumber = rollNumber;
       this.grade = grade;
       totalStudents++;
   }

   public static void displayTotalStudents() {
       System.out.println("Total Students are: " + totalStudents);
   }

   public void display() {
       System.out.println("Name of the student is : " + name);
       System.out.println("Roll Number of student is: " + rollNumber);
       System.out.println("Grade of the student is : " + grade);
   }

}


public class University {
   public static void main(String[] args) {
       Student student1 = new Student("Ram", 001, "B");
       Student student2 = new Student("Shyam", 011, "A");

       System.out.println("our university name is:   " + Student.universityName);
       Student.displayTotalStudents();
       System.out.println();

       if (student1 instanceof Student) {
           System.out.println();
           System.out.println("student1 is an instance of Student");
           System.out.println("Displaying student1 details");
           student1.display();
       }

       if (student2 instanceof Student) {
           System.out.println();
           System.out.println("student2 is an instance of Student");
           System.out.println("Displaying student2 details");
           student2.display();
       }
   }
}