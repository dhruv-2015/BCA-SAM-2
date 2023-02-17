import java.util.Scanner;

public class armstrong2 {
    public static int sum(int i, int num) {
        int temp = 1;
        for (int j = 0; j < i; j++) {
            temp *= num;
        }
        return temp;
    }
    public static void check(int num) {
        Scanner sc = new Scanner(System.in);
        int armnum = 0;
        int sum = 0;

        int temp = num;
        int index = 0;
        
        while (temp != 0) {
            index++;
            temp /= 10;
        }
        // System.out.println(index);
        temp = num;
        while (temp != 0) {
            sum += sum(index, (temp % 10));
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is armstrong number");
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 10_000; i++) {
            check(i);
        }
    }
}
