import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st value: ");
        float v1 = sc.nextFloat();
        System.out.print("enter 2st value: ");
        float v2 = sc.nextFloat();
        System.out.print("enter 3st value: ");
        float v3 = sc.nextFloat();

        if (v1 == v2 && v2 == v3) {
            System.out.println("triangle is equilateral");
        } else if (v1 == v2 || v1 == v3 || v2 == v3) {
            System.out.println("triangle is isosceles");
        } else if (v1 != v2 && v1 != v3 && v2 != v3) {
            System.out.println("triangle is scalene");
        }
        
    }
}