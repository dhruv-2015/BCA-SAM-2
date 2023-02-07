import java.util.Scanner;

public class ReadAndPrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int size = sc.nextInt();
        int array[][] = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("enter number of " + (i + 1) + "'s rows " + (j + 1) + "'s element: ");
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix is :");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
