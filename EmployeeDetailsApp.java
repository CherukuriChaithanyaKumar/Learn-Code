package sample;

import java.io.*;
import java.util.Scanner;

public class EmployeeDetailsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee details:");

        System.out.print("Employee ID: ");
        String empId = scanner.nextLine();

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Age: ");
        String age = scanner.nextLine();

        System.out.print("Department: ");
        String department = scanner.nextLine();

        System.out.print("Position: ");
        String position = scanner.nextLine();

        System.out.print("Salary: ");
        String salary = scanner.nextLine();

        Employee employee = new Employee(empId, firstName, lastName, age, department, position, salary);

        EmployeeFileWriter writer = new EmployeeFileWriter("employee_data.csv");
        writer.save(employee);

        scanner.close();
    }
}

class Employee {
    private final String empId;
    private final String firstName;
    private final String lastName;
    private final String age;
    private final String department;
    private final String position;
    private final String salary;

    public Employee(String empId, String firstName, String lastName, String age, String department, String position, String salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public String toCSV() {
        return String.join(",", empId, firstName, lastName, age, department, position, salary);
    }
}

class EmployeeFileWriter {
    private final String fileName;

    public EmployeeFileWriter(String fileName) {
        this.fileName = fileName;
    }

    public void save(Employee employee) {
        File file = new File(fileName);
        boolean isNewFile = file.length() == 0;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            if (isNewFile) {
                writer.write("Employee ID,First Name,Last Name,Age,Department,Position,Salary\n");
            }
            writer.write(employee.toCSV() + "\n");
            System.out.println("Employee details saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving employee data: " + e.getMessage());
        }
    }
}
