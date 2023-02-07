import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");

        int num = sc.nextInt();
        int num2 = 0;
        int i = num;
        while (i != 0) {
            num2 *= 10;
            num2 += (i % 10);
            i /= 10;
        }
        System.out.println(num + " in reverse is " + num2);
    }
}
