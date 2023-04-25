import java.util.Scanner;

public class s8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Real number for 1st obj: ");
        int real = sc.nextInt();
        System.out.print("enter imaginary number for 1st obj: ");
        ComplexNumber obj1 = new ComplexNumber(real, sc.next());
        System.out.print("enter Real number for 2nd obj: ");
        real = sc.nextInt();
        System.out.print("enter imaginary number for 2nd obj: ");
        ComplexNumber obj2 = new ComplexNumber(real, sc.next());
        ComplexNumber.add(obj1, obj2);
    }
}

class ComplexNumber {
    int real;
    String img;
    char imgc;
    int imgi;

    ComplexNumber(int real, String img) {
        this.real = real;
        this.img = img;
        this.imgc = img.charAt(img.length() - 1);
        img = img.substring(0, img.length() - 1);
        this.imgi = Integer.parseInt(img);
    }

    public static void add(ComplexNumber obj1, ComplexNumber obj2) {
        int real = obj1.real + obj2.real;
        if (obj1.imgc != obj2.imgc) {
            System.out.println(obj1.real + " + " + obj1.imgi+ obj1.imgc + "   +   " + obj2.real + " + " + obj2.imgi+ obj2.imgc + "   =   " + real + " + " + obj1.imgi+ obj1.imgc + " + " + obj2.imgi+ obj2.imgc);
        } else {
            System.out.println(obj1.real + " + " + obj1.imgi+ obj1.imgc + "   +   " + obj2.real + " + " + obj2.imgi+ obj2.imgc + "   =   " + real + " + " + (obj1.imgi + obj2.imgi)+ obj1.imgc);
        }
    }
}
