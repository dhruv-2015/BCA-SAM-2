import java.util.Scanner;

public class armstrong {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int armnum = 0;
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        int index = 0;
        while (temp != 0) {
            index++;
            temp /= 10;
        }
        temp = num;
        while (temp != 0) {
            int tempnum = temp % 10;
            int tempsum = 1;
            for (int j = 0; j < index; j++) {
                tempsum *= tempnum;
            }
            sum += tempsum;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is armstrong number");
        } else {
            System.out.println(num + " is not armstrong number");
        }
    }

}
