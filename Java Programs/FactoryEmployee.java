// 16. Create a subclass called FactoryEmployee, for all factory employees we need to store bus_no, emp_boards.Create a super class related to this subclass.

// Superclass: Employee
public class Employee {
    private int empId;
    private String name;
    private double salary;

    // Constructor to initialize Employee details
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods for Employee details
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods (if needed)
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass: FactoryEmployee
public class FactoryEmployee extends Employee {
    private String busNo;
    private String empBoards;

    // Constructor for FactoryEmployee that also initializes the Employee superclass
    public FactoryEmployee(int empId, String name, double salary, String busNo, String empBoards) {
        super(empId, name, salary); // Call to superclass constructor
        this.busNo = busNo;
        this.empBoards = empBoards;
    }

    // Getter and setter methods for busNo and empBoards
    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public String getEmpBoards() {
        return empBoards;
    }

    public void setEmpBoards(String empBoards) {
        this.empBoards = empBoards;
    }

    // Method to display the complete factory employee info
    public void displayFactoryEmployeeInfo() {
        // Display common employee details
        super.displayEmployeeInfo();
        // Display factory-specific details
        System.out.println("Bus No: " + busNo);
        System.out.println("Employee Boards: " + empBoards);
    }

    // Main method to test the FactoryEmployee class
    public static void main(String[] args) {
        // Creating a FactoryEmployee object
        FactoryEmployee factoryEmp = new FactoryEmployee(101, "Alice", 30000.0, "Bus-42", "Main Gate");

        // Displaying all the details
        factoryEmp.displayFactoryEmployeeInfo();
    }
}
