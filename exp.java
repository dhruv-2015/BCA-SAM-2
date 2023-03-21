import java.util.Scanner;

public class exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("enter n2: ");
        int n2 = sc.nextInt();
        int res = add(n1, n2);
        System.out.println(res);
    }
    public static int add(int n1, int n2) {
        return n1 + n2;
    }
}
