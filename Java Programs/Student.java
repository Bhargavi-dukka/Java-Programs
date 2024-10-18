public class Student {
    // Constants for the fees of each course
    private static final double JAVA_FEES = 10000;
    private static final double PYTHON_FEES = 7500;

    // Attributes to store student details
    private int admin_no;
    private String stu_name;
    private String course_joined;
    private double fees_paid;

    // Constructor to initialize the student details with default course "JAVA"
    public Student(int admin_no, String stu_name, String course_joined, double fees_paid) {
        this.admin_no = admin_no;
        this.stu_name = stu_name;
        this.course_joined = (course_joined.equalsIgnoreCase("PYTHON")) ? "PYTHON" : "JAVA"; // Default is JAVA
        this.fees_paid = fees_paid;
    }

    // Constructor with default course set to JAVA
    public Student(int admin_no, String stu_name) {
        this(admin_no, stu_name, "JAVA", 0.0); // Calls the above constructor with default course JAVA and no fees paid
    }

    // Method to return the total fee for the selected course
    public double getTotalFee() {
        if (course_joined.equalsIgnoreCase("JAVA")) {
            return JAVA_FEES;
        } else {
            return PYTHON_FEES;
        }
    }

    // Method to return the fees still due
    public double getDue() {
        return getTotalFee() - fees_paid;
    }

    // Method to return the amount of fees already paid
    public double getFeePaid() {
        return fees_paid;
    }

    // Method to make a payment and update the fees_paid
    public void payment(double amount) {
        if (amount > 0) {
            fees_paid += amount;
            System.out.println("Payment of Rs." + amount + " made successfully. Total fees paid: Rs." + fees_paid);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Admin No: " + admin_no);
        System.out.println("Student Name: " + stu_name);
        System.out.println("Course Joined: " + course_joined);
        System.out.println("Total Fee: Rs." + getTotalFee());
        System.out.println("Fees Paid: Rs." + fees_paid);
        System.out.println("Fees Due: Rs." + getDue());
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Creating a student with the default course (JAVA)
        Student student1 = new Student(1001, "Alice");
        student1.displayStudentDetails();
        student1.payment(3000); // Making a payment
        student1.displayStudentDetails();

        // Creating a student who has joined the PYTHON course
        Student student2 = new Student(1002, "Bob", "PYTHON", 2500);
        student2.displayStudentDetails();
        student2.payment(2000); // Making another payment
        student2.displayStudentDetails();
    }
}