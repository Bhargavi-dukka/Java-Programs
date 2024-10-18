// 16. Create a subclass called FactoryEmployee, for all factory employees we need to store bus_no, emp_boards.Create a super class related to this subclass.


public class Employee {
    private int empId;
    private String name;
    private double salary;


    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


public class FactoryEmployee extends Employee {
    private String busNo;
    private String empBoards;

    public FactoryEmployee(int empId, String name, double salary, String busNo, String empBoards) {
        super(empId, name, salary); 
        this.busNo = busNo;
        this.empBoards = empBoards;
    }

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

    public void displayFactoryEmployeeInfo() {
       
        super.displayEmployeeInfo();
        
        System.out.println("Bus No: " + busNo);
        System.out.println("Employee Boards: " + empBoards);
    }

  
    public static void main(String[] args) {
        
        FactoryEmployee factoryEmp = new FactoryEmployee(101, "Alice", 30000.0, "Bus-42", "Main Gate");

        factoryEmp.displayFactoryEmployeeInfo();
    }
}
