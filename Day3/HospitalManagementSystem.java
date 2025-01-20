
    class Patient {
        // Static variable shared by all patients to hold the hospital name
        static String hospitalName = "City Hospital";
        // Static variable to keep count of total patients
        static int totalPatients = 0;
    
        // Final variable for patient ID (cannot be changed once assigned)
        final int patientID;
        String name;
        int age;
        String ailment;
    
        // Constructor to initialize name, age, ailment, and patientID using 'this'
        public Patient(int patientID, String name, int age, String ailment) {
            this.patientID = patientID;  
            this.name = name;            
            this.age = age;             
            this.ailment = ailment;      
            totalPatients++;            
        }
    
        // Static method to return the total number of patients
        static int getTotalPatients() {
            return totalPatients;
        }
    
        // Method to display patient details
        void displayPatientDetails() {
            System.out.println("Patient Details:");
            System.out.println("ID: " + this.patientID);
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ailment: " + this.ailment);
            System.out.println("Hospital: " + hospitalName);  // hospitalName is static
        }
        public class HospitalManagementSystem {
        // Main method to test the class
        public static void main(String[] args) {
            // Creating instances of Patient
            Patient patient1 = new Patient(101, "Ram", 30, "Fever");
            Patient patient2 = new Patient(102, "Shyam", 45, "Fracture");
    
            // Displaying details of the patients
            patient1.displayPatientDetails();
            patient2.displayPatientDetails();
    
            // Display total number of patients
            System.out.println("Total number of patients: " + Patient.getTotalPatients());
        }
    }
    
}
