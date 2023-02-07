import java.util.Scanner;

class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number you want to enter: ");
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter " + (i + 1) + "'s number: ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.print("Numbers which are divisible by either 3 or 5: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 || arr[i] % 5 == 0) {
                sum += arr[i];
                System.out.print(arr[i]);
                System.out.print((i == arr.length - 1) ? " = " : " + ");
            }
        }
        System.out.print(sum);
    }
}
