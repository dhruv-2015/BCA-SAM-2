import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int gcd = 1;
        int i = 1;

        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
