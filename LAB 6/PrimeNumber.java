import java.util.Scanner;

public class PrimeNumber {
    public static int checkPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) 
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int ans = checkPrime(num);
        if (ans == 1) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime number");
        }
    }
}
