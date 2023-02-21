import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int len = 0;
        while (num != 0) {
            num = num / 10;
            len++;
        }
        System.out.println("Length is: " + len);
    }
}
