import java.util.Scanner;
class Volume {
    double L;
    double B;
    double H;

    Volume(double L, double B, double H) {
        this.L = L;
        this.B = B;
        this.H = H;
    }

    public void volume() {
        System.out.println("Volume is: " + (L * B * H));
    }
}

public class s2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter L: ");
        double l = sc.nextDouble();
        System.out.print("Enter B: ");
        double b = sc.nextDouble();
        System.out.print("Enter H: ");
        double h = sc.nextDouble();
        Volume vol1 = new Volume(l, b, h);
        vol1.volume();
    }
}
