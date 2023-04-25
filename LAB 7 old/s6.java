import java.util.Scanner;

public class s6 {
    // area and perimeter
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Enter R: ");
        double r = sc.nextDouble();
        System.out.println("Area is: " + c.area(55));
        System.out.println("Perimeter is: " + c.perimeter(55));
        
    }
}

class Circle {

    public double area(double r) {

        return 3.14 * r * r;
    }

    public double perimeter(double r) {
        return 2 * 2.14 * r;
    }
}