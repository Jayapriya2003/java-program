import java.util.Scanner;

interface EmployeeData {
    void getEmployeeData(String name, int empid, String designation, double salary);
    double calculateSalary();
    void displayDetails();
}

class Employee implements EmployeeData {
    private String name;
    private int empid;
    private String designation;
    private double salary;

    public void getEmployeeData(String name, int empid, String designation, double salary) {
        this.name = name;
        this.empid = empid;
        this.designation = designation;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary * 12; // Assuming salary is monthly salary, calculate annual salary
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Id: " + empid);
        System.out.println("Employee Designation: " + designation);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String name = s.nextLine();

        System.out.println("Enter Employee Id:");
        int empid = s.nextInt();
        s.nextLine(); // Consume newline left-over

        System.out.println("Enter Employee Designation:");
        String designation = s.nextLine();

        System.out.println("Enter Employee Salary:");
        double salary = s.nextDouble();

        EmployeeData emp = new Employee();
        emp.getEmployeeData(name, empid, designation, salary);

        System.out.println("Employee Details:");
        emp.displayDetails();
        System.out.println("Annual Salary: " + emp.calculateSalary());
    }
}