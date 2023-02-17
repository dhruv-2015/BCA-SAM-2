import java.util.Scanner;

public class SimpleInterest {
    public static double calculateInterest(Double p, Double r, Double n) {
        return (p * r * n) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter P: ");
        double P = sc.nextDouble();
        System.out.print("Enter R: ");
        double R = sc.nextDouble();
        System.out.print("Enter N: ");
        double N = sc.nextDouble();
        double interest = calculateInterest(P, R, N);
        System.out.println("interest is: " + interest);
    }    
}
