import java.util.Scanner;

class Employee {
    // Employee_ID, Employee_Name, Designation, Age, Salary
    String Employee_ID;
    String Employee_Name;
    String Designation;
    double Age;
    double Salary;

    public void GetEmployeeDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        Employee_ID = sc.next();
        System.out.print("Enter Employee Name: ");
        Employee_Name = sc.nextLine();
        System.out.print("Enter Designation: ");
        Designation = sc.next();
        System.out.print("Enter Age: ");
        Age = sc.nextDouble();
        System.out.print("Enter Salary: ");
        Salary = sc.nextDouble();
    }

    public void DisplayEmpolyeeDetails() {
        System.out.println("=> EmpolyeeDetails <=");
        System.out.println("Employee ID: " + Employee_ID);
        System.out.println("Employee Name: " + Employee_Name);
        System.out.println("Designation: " + Designation);
        System.out.println("Age: " + Age);
        System.out.println("Salary: " + Salary);
    }
}

public class s4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        employee.GetEmployeeDetails(sc);
        employee.DisplayEmpolyeeDetails();
    }
}
