// Superclass Course
class Course {
    String courseName;
    int duration; // Duration in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass OnlineCourse
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call to the superclass constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // Discount as a percentage

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call to the superclass constructor
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: Rs" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

// Main class to test the system
public class CourseSystem {
    public static void main(String[] args) {
        // Creating objects of each class
        Course course = new Course("Basic Programming", 8);
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 12, "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Machine Learning", 16, "Coursera", true, 7500.0, 15.0);

        // Displaying information of each course
        System.out.println("Course Info:");
        course.displayInfo();
        System.out.println();

        System.out.println("Online Course Info:");
        onlineCourse.displayInfo();
        System.out.println();

        System.out.println("Paid Online Course Info:");
        paidOnlineCourse.displayInfo();
    }
}

