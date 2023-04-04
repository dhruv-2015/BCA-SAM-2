import java.util.Scanner;

public class s3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Real number for 1st obj: ");
        int real = sc.nextInt();
        System.out.print("enter imaginary number for 1st obj : ");
        ComplexNumber obj1 = new ComplexNumber(real, sc.next());
        System.out.print("enter Real number for 2nd obj: ");
        real = sc.nextInt();
        System.out.print("enter imaginary number for 2nd obj : ");
        ComplexNumber obj2 = new ComplexNumber(real, sc.next());
        ComplexNumber obj3 = new ComplexNumber();
        obj3.add(obj1, obj2);
        obj3.display();
    }
}

class ComplexNumber {
    int real;
    int imgi;

    ComplexNumber(int real, String img) {
        this.real = real;
        if (img.charAt(img.length() - 1) != 'i') {
            this.imgi = Integer.parseInt(img);
        } else {
            img = img.substring(0, img.length() - 1);
            this.imgi = Integer.parseInt(img);
        }
    }

    ComplexNumber(String img, int real) {
        this.real = real;
        if (img.charAt(img.length() - 1) != 'i') {
            this.imgi = Integer.parseInt(img);
        } else {
            img = img.substring(0, img.length() - 1);
            this.imgi = Integer.parseInt(img);
        }
    }

    ComplexNumber() {
    }

    public void add(ComplexNumber obj1, ComplexNumber obj2) {
        this.real = obj1.real + obj2.real;
        this.imgi = obj1.imgi + obj2.imgi;

        // System.out.println(obj1.real + "+" + obj1.imgi + "i + " + obj2.real + "+" +
        // obj2.imgi + "i = " + real + "+" + this.imgi + "i");
    }

    public void display() {
        System.out.println("= " + real + " + " + imgi + "i");
    }
}
