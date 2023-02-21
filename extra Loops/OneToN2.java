import java.util.Scanner;

public class OneToN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int localSum = i * i;
            System.out.print((i == n) ? localSum : (localSum) + " + ");
            sum += localSum;
        }
        System.out.println(" = " + sum);
    }
}
