import java.util.Scanner;

class pos_neg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number: ");
		double n = sc.nextDouble();
		if (n < 0) {
			System.out.println("enter number is less then zero( negitive) ");
		} else {
			System.out.println("enter number is grater then zero ( positive )");
		}
	}
}