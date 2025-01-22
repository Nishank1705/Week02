import java.util.ArrayList;

class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        System.out.println("Doctor " + name + " is consulting patient " + patient.name);
    }

    public void displayPatients() {
        System.out.println("Patients of Doctor " + name + ":");
        for (Patient patient : patients) {
            System.out.println(patient.name);
        }
        System.out.println();
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void displayDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.name);
        }
        System.out.println();
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Rahul");
        Patient patient2 = new Patient("vivek");

        Doctor doctor1 = new Doctor("Dr. Abhay");
        Doctor doctor2 = new Doctor("Dr. Nishank");

        Hospital hospital = new Hospital("City Hospital");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        hospital.displayDoctors();

        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        doctor1.displayPatients();
        doctor2.displayPatients();
    }
}