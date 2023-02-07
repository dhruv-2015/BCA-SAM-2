import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many number you want to enter: ");
        int arr[] = new int[sc.nextInt()];
        int odd = 0, even = 0;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter " + (i + 1) + "'s number: ");
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.print("Even numbers: " + even);
        System.out.print("\nOdd numbers: " + odd);
    }
}
