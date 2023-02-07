import java.util.Scanner;

import java.lang.Math;

class DIA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter area of circle: ");
		double area = sc.nextDouble();
		double r;
		r = area / 3.14;
		r = Math.sqrt(r);
		r = r * 2;
		System.out.println("diametor is: " + r);
	}
}