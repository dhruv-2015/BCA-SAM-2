import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int lcm;

        int larger = Math.max(num1, num2);
        int smaller = Math.min(num1, num2);

        lcm = larger;

        while (true) {
            if (lcm % smaller == 0) {
                break;
            }
            lcm += larger;
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
