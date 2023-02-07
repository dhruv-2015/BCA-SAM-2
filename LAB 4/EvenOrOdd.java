import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many number you want to enter: ");
        int arr[] = new int[sc.nextInt()];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter " + (i + 1) + "'s number: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Even numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + "  ");
            }
        }
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + "  ");
            }
        }
    }
}
