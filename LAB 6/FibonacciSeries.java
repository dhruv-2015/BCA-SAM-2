import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        printFib(n);
        // int prev = 0;
        // int current = 1;

        // for (int i = 1; i < n; i++) {
        //     System.out.print((i == n - 1) ? current + " " : (i == 1) ? "0, 1, " : current + ", ");
        //     int temp = prev;
        //     prev = current;
        //     current = current + temp;
        // }
    }
    
    public static void printFib(int n) {
        int prev = 0;
        int current = 1;

        for (int i = 1; i < n; i++) {
            System.out.print((i == n - 1) ? current + " " : (i == 1) ? "0, 1, " : current + ", ");
            int temp = prev;
            prev = current;
            current = current + temp;
        }
    }
}