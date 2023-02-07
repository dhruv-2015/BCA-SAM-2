import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first value: ");
        float first = sc.nextFloat();
        System.out.print("enter second value: ");
        float second = sc.nextFloat();
        System.out.print("what you want to do (+ - * /): ");
        char ex = sc.next().charAt(0);

        switch (ex) {
            case '+':
                System.out.println(first + " + " + second + " = " + (first + second));
                break;
            case '-':
                System.out.println(first + " - " + second + " = " + (first - second));
                break;
            case '*':
                System.out.println(first + " * " + second + " = " + (first * second));
                break;
            case '/':
                System.out.println(first + " / " + second + " = " + (first / second));
                break;
            default:
                System.out.println("i cant do that");
                break;
        }

    }
}