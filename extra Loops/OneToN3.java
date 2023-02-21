import java.util.Scanner;

public class OneToN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nummber: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print((i == 1) ? "" : " + ( ");
            int localSum = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print((j == i) ? j : j + " + ");
                localSum += j;
            }
            System.out.print((i == 1) ? "" : " )");
            sum += localSum;
        }
        System.out.println(" = " + sum);
    }
}
