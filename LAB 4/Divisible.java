import java.util.Scanner;

class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number you want to enter: ");
        int arr[] = new int[sc.nextInt()];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter " + (i + 1) + "'s number: ");
            arr[i] = sc.nextInt();
            if (arr[i] % 3 == 0 || arr[i] % 5 == 0) {
                sum += arr[i];
            }
        }
        System.out.print("Sum of Numbers which are divisible by either 3 or 5: " + sum);
    }
}
