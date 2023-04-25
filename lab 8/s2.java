import java.util.Scanner;
class Volume {
    double L;
    double W;
    double H;

    Volume(double L, double W, double H) {
        this.L = L;
        this.W = W;
        this.H = H;
    }

    public void volume() {
        System.out.println("Volume is: " + (L * W * H));
    }
}

public class s2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double len = sc.nextDouble();
        System.out.print("Enter width: ");
        double wid = sc.nextDouble();
        System.out.print("Enter height: ");
        double hei = sc.nextDouble();
        Volume vol1 = new Volume(len, wid, hei);
        vol1.volume();
    }
}
