import java.util.Scanner;

class Student {
    public int EnrolmentNo;
    public String name;
    public String gender;
    public double marks;
    public static int count = 0;

    Student(int envirmentNoOfStudent, String nameOfStudent, String genderOfStudent, double marksOfStudent) {
        EnrolmentNo = envirmentNoOfStudent;
        name = nameOfStudent;
        gender = genderOfStudent;
        marks = marksOfStudent;
        count++;
    }

    public void display() {
        System.out.println();
        System.out.println("Enrolment No: " + EnrolmentNo);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Marks: " + marks);
        System.out.println("Number of Object: " + count);
    }
}

public class s3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Student Details");
        System.out.print("Enter envirment No: ");
        int e = sc.nextInt();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Gender: ");
        String gen = sc.next();
        System.out.print("Enter Marks: ");
        int m = sc.nextInt();
        Student student = new Student(e, name, gen, m);
        System.out.println("Enter 2nd Student Details");
        System.out.print("Enter envirment No: ");
        e = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Gender: ");
        gen = sc.next();
        System.out.print("Enter Marks: ");
        m = sc.nextInt();
        Student student2 = new Student(e, name, gen, m);
        System.out.println("\n");
        System.out.println("1st Student Details");
        student.display();
        System.out.println("\n2nd Student Details");
        student2.display();

    }
}