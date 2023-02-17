import java.util.Scanner;

public class perfectnumber2 {
    public static void check(int num) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (num == sum) {
            System.out.println(num + " is perfect number");
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 1_00_00_000; i++) {
            check(i);
        }
    }
}
