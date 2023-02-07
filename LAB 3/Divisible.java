import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("enter first number: ");
        n1 = sc.nextInt();
        System.out.print("enter second number: ");
        n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0 && i % 3 != 0) {
                System.out.print(i + "  ");
            }
        }
    }
}