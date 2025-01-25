// Main class to demonstrate the Hospital Patient Management System
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient inpatient = new InPatient("P001", "Alice", 45, 5);
        Patient outpatient = new OutPatient("P002", "Bob", 30, 2);

        System.out.println(inpatient.getPatientDetails() + ", Bill: " + inpatient.calculateBill());
        System.out.println(outpatient.getPatientDetails() + ", Bill: " + outpatient.calculateBill());
    }
}

// Abstract class representing a patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}

// Subclass InPatient
class InPatient extends Patient {
    private int daysAdmitted;
    private static final double DAILY_CHARGE = 2000;

    public InPatient(String patientId, String name, int age, int daysAdmitted) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * DAILY_CHARGE;
    }
}

// Subclass OutPatient
class OutPatient extends Patient {
    private int consultations;
    private static final double CONSULTATION_FEE = 500;

    public OutPatient(String patientId, String name, int age, int consultations) {
        super(patientId, name, age);
        this.consultations = consultations;
    }

    @Override
    public double calculateBill() {
        return consultations * CONSULTATION_FEE;
    }
}
