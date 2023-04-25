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
}

public class s1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student(22401031, "Dhruv", "male", 20);
        Student student1 = new Student(22401032, "Dhruv1", "male", 20);
        Student student2 = new Student(22401033, "Dhruv2", "male", 20);
        System.out.println("Total Object: " + Student.count);

    }
}