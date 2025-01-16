

 class Student{
    String name;
    int rollno;
    int marks;
    public Student(String name, int rollno, int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    public String gradeCalculator(){
        if(marks>=90){
            return "A";
        }
        else if (marks>=80 && marks<90)
            return "B";
        else if(marks>=70 && marks<80)
        return "C";
        else if(marks>=60 && marks<70)
        return "D";
        else 
        return "Scope of Improvement";
        }
    public void displayDetails(){
        System.out.println("Student name is "+ name);
        System.out.println("Student rollno is "+ rollno);
        System.out.println("student total marks is "+ marks);
        System.out.println("student grade is "+ gradeCalculator());
    } 
    }
 public class Grades{
    public static void main(String[] args) {
        Student object = new Student("Tikesh",9898,60);
        object.displayDetails();
        
    }
 }
 