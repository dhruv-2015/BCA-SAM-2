import java.util.Scanner;

class Rectangle {
    int length;
    int width;
    static int count;

    static {
        System.out.println("Rectangle staric block Of Rectangle Class");
        count = 0;
    }
    {
        System.out.println("Running initializer block Of Rectangle Class");
        count++;
    }

    Rectangle() {

    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    Rectangle(Rectangle obj) {
        this.length = obj.length;
        this.width = obj.width;
    }

    public void area() {
        System.out.println("Area is: " + (length * width));
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Count: " + count);
    }
}

public class s4 {
    static {
        System.out.println("Running Static Block Of s4 Class");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int len = sc.nextInt();
        System.out.print("Enter width: ");
        int wid = sc.nextInt();

        System.out.println("\n");

        Rectangle x = new Rectangle(len, wid);
        x.display();
        x.area();
        
        System.out.println("\n");

        Rectangle y = new Rectangle(x);
        y.display();
        y.area();

    }
}