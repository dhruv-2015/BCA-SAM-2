import java.util.Scanner;
public class PresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many numbers you want to enter: ");
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter " + (i + 1) + "'s number: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("enter number: ");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(arr[i] + " is present in array");
                System.out.println("index of " + arr[i] + " is " + i);
                return;
            }
        }
        System.out.println(num + " is not in array");
    }
}
