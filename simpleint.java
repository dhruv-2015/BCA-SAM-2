import java.util.Scanner;

public class simpleint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p:");
        double p = sc.nextDouble();
        System.out.print("Enter r:");
        double r = sc.nextDouble();
        System.out.print("Enter n:");
        double n = sc.nextDouble();

        double i = prn(p, r, n);
        System.out.println("intrest is: " + i);
        
    }
    public static double prn(double p, double r, double n) {
        return (p * r * n) / 100;
    }
}
