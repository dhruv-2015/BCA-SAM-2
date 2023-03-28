import java.util.Scanner;

class Student {
    public int EnrolmentNo;
    public String name;
    public String gender;
    public double marks;

    Student(int envirmentNoOfStudent, String nameOfStudent, String genderOfStudent, double marksOfStudent) {
        EnrolmentNo = envirmentNoOfStudent;
        name = nameOfStudent;
        gender = genderOfStudent;
        marks = marksOfStudent;
    }
    public void display() {
        System.out.println("Enrolment No: " + EnrolmentNo);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class s1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter envirment No: ");
        int e = sc.nextInt();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Gender: ");
        String gen = sc.next();
        System.out.print("Enter Marks: ");
        int m = sc.nextInt();
        Student student = new Student(e, name, gen, m);
        student.display();

    }
}