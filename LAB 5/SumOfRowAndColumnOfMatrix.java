import java.util.Scanner;

public class SumOfRowAndColumnOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int size = sc.nextInt();
        int rowSum[] = new int[size];
        int colSum[] = new int[size];
        // System.out.println(colSum[0]);
        int array[][] = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            rowSum[i] = 0;
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("enter number of " + (i + 1) + "'s rows " + (j + 1) + "'s element: ");
                array[i][j] = sc.nextInt();
                rowSum[i] += array[i][j];
                colSum[j] += array[i][j];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(" = " + rowSum[i]);
        }
        System.out.println("col sum:");
        for (int i = 0; i < colSum.length; i++) {
            System.out.print(colSum[i] + "\t");
        }
    }
}
