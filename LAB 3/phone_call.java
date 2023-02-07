// first 100 calls 200rs
// next 50 call 0.6rs/call    101 - 150 call
// next 50 call 0.5rs/call    151 - 200 call
// above 200 calls 0.4rs/call     200+ call



import java.util.Scanner;

public class phone_call {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many call you make: ");
        int cal = sc.nextInt();
        double bill = 200;
        if (cal > 100) {
            int c1 = (cal > 150) ? 50 : cal - 100;
            bill += (0.6 * c1);
        }
        if (cal > 150) {
            int c1 = (cal > 200) ? 50 : cal - 150;
            bill += (0.5 * c1);
        }
        if (cal > 200) {
            bill += (0.4 * (cal - 200));
        }
        System.out.println("your bill is:" + bill);
    }
}
