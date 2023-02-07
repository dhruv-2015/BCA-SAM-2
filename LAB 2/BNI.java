import java.util.Scanner;

public class BNI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight: ");
		float w = sc.nextFloat();
		System.out.print("Enter hight: ");
		float h = sc.nextFloat();
		w = w * 0.4535f;
		h = h * 0.0254f;
		float bni = w / (h * h);
		System.out.println("BNI is " + bni);
	}
}