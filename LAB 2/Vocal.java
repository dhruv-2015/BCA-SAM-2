import java.util.Scanner;

class Vocal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter char: ");
		char c = sc.next().charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.print("enter char is vocal ");
		} else {
			System.out.print("enter char is not vocal");
		}
	}
}