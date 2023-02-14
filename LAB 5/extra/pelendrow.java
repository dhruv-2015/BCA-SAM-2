import java.util.Scanner;

public class pelendrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int revnum = 0;
        int number = sc.nextInt();
        int temp = number;
        while (temp != 0) {
            revnum *= 10;
            revnum += (temp % 10);
            temp /= 10;
        }
        if (number == revnum) {
            System.out.println(number + " is ");
        } else {
            System.out.println(number + " is not ");

        }
    }
}
