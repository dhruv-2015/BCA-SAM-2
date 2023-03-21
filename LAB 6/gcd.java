import java.util.Scanner;

public class gcd {
    public int gcd(int num1, int num2) {
        int bigger = (num1 < num2) ? num2 : num1;
        int GCD = 1;
        for (int i = 1; i <= bigger; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                GCD = i;
            }
        }
        return GCD;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        gcd g = new gcd();

        int GCD = g.gcd(num1, num2);
        System.out.println("GCD is: " + GCD);
    }
}