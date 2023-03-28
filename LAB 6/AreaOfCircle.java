import java.util.Scanner;
public class AreaOfCircle {

    static float area(float radius) {
        return 3.14f * radius * radius;
    }

    static double area(double height, double base) {
        return (height * base) / 2;
    }

    static int area(int len) {
        return len * len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("=> Area Of Circle <=");
        System.out.print("Enter radius :");
        float radius = sc.nextFloat();
        System.out.println("Area : " + area(radius));

        // System.out.println("\n=> Area Of Triangle <=");
        System.out.print("Enter Height : ");
        double height = sc.nextDouble();
        System.out.print("Enter Base : ");
        double base = sc.nextDouble();
        System.out.println("Area : " + area(height, base));

        // System.out.println("\n=> area of square <=");
        System.out.print("Enter Side : ");
        int side = sc.nextInt();
        System.out.println("Area : " + area(side));
    }
}