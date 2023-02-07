import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f;
        System.out.print("enter number: ");
        f = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= f; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + f + " is " + factorial);
    }
}
