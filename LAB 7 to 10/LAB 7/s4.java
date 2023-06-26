import java.util.Scanner;

public class s4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.GetStudentDetails(sc);
        System.out.println("------------------------");
        student.DisplayStudentDetails();
    }
}

class Student {
    private String Enrollment_No;
    private String Student_Name;
    private int Semester;
    private double SPI;

    public void GetStudentDetails(Scanner sc) {
        System.out.print("Enter Enrollment No: ");
        Enrollment_No = sc.next();
        System.out.print("Enter Student Name: ");
        sc.nextLine();
        Student_Name = sc.nextLine();
        System.out.print("Enter Semester: ");
        Semester = sc.nextInt();
        System.out.print("Enter SPI: ");
        SPI = sc.nextDouble();
    }

    public void DisplayStudentDetails() {
        System.out.println("=> StudentDetails <=");
        System.out.println("Enrollment No: " + Enrollment_No);
        System.out.println("Student Name: " + Student_Name);
        System.out.println("Semester: " + Semester);
        System.out.println("SPI: " + SPI);
    }
}
