import java.util.Scanner;

public class MultiplicationOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1x, m1y, m2x, m2y;
        System.out.print("Enter 1st matrix's x");
        m1x = sc.nextInt();
        System.out.print("Enter 1st matrix's y");
        m1y = sc.nextInt();

        System.out.print("Enter 2nd matrix's x");
        m2x = sc.nextInt();
        System.out.print("Enter 2nd matrix's y");
        m2y = sc.nextInt();
        if (m1y != m2x) {
            System.out.println("Multiplication not possible");
            return;
        }
        int merrix1[][] = new int[m1x][m1y];
        int merrix2[][] = new int[m2x][m2y];
        System.out.println("enter 1st matrix");
        for (int i = 0; i < merrix1.length; i++) {
            for (int j = 0; j < merrix1[i].length; j++) {
                System.out.print("enter of " + (i + 1) + "'s rows " + (j + 1) + "'s element: ");
                merrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter 2nd matrix");
        for (int i = 0; i < merrix2.length; i++) {
            for (int j = 0; j < merrix2[i].length; j++) {
                System.out.print("enter of " + (i + 1) + "'s rows " + (j + 1) + "'s element: ");
                merrix2[i][j] = sc.nextInt();
            }
        }
        
        int sum[][] = new int[m1x][m2y];
        for (int i = 0; i < m1x; i++) {
            for (int j = 0; j < m2y; j++) {
                sum[i][j] = 0;
                for (int k = 0; k < m1y; k++) {
                    sum[i][j] += (merrix1[i][k] * merrix2[k][j]);
                }
            }
        }
        System.out.println("Multiplication of metrices is :");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
