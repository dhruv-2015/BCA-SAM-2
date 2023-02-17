import java.util.Scanner;

public class temp {
    public static void check(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return;
            }
        }
        System.out.println(num + " is prime number");
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            check(i);
        }
    }
}
