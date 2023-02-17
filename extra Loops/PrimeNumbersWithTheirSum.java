import java.util.Scanner;

public class PrimeNumbersWithTheirSum {
    public static int checkPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you want to check: ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Prime numbers are: ");
        for (int i = 1; i <= n; i++) {
            int check = checkPrime(i);
            if (check == 1) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("= " + sum);
    }
}
