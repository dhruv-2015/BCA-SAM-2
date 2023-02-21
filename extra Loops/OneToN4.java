import java.util.Scanner;

public class OneToN4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nummber: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print((i == 1) ? "" : " + " + i + "( ");
            int localSum = 0;
            for (int j = 1; j <= i; j++) {
                int LS = j * j;
                System.out.print((j == i) ? LS : LS + " + ");
                localSum += LS;
            }
            System.out.print((i == 1) ? "" : " )");
            sum += (localSum * i);
        }
        System.out.println(" = " + sum);
    }
}

