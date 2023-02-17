import java.util.Scanner;

public class MaximumNumber {

    public static int findMax(int i, int j) {
        return (i < j) ? j : i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int n2 = sc.nextInt();

        System.out.println("largest number from " + n1 + " and " + n2 + " is: " + findMax(n1, n2));
    }
}
