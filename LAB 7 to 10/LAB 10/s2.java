class Shape {

}

class Circle extends Shape {
    double r;

    Circle(Double r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Area of Circle is: " + (3.14 * r * r));
    }
}

class Triangle extends Shape {
    double h;
    double b;

    Triangle(double h, double b) {
        this.h = h;
        this.b = b;
    }

    public void area() {
        System.out.println("Area of Triangle is: " + (h * b));
    }
}

class Square extends Shape {
    double s;

    Square(double s) {
        this.s = s;
    }

    public void area() {
        System.out.println("Area of Square is: " + (s * s));
    }
}

public class s2 {
    public static void main(String[] args) {
        Circle c = new Circle(14.0);
        c.area();
        Triangle t = new Triangle(15.0, 6.0);
        t.area();
        Square s = new Square(155);
        s.area();

    }
}
