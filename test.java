class shape {
    double r;
    double h;
    double b;
    double s;

    void area() {
        System.out.println("area of shapes are according to shape name");
    }
}

class circle extends shape {
    circle(Double r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Area of Circle is: " + (3.14 * r * r));
    }
}

class Triangle extends shape {
    Triangle(double h, double b) {
        this.h = h;
        this.b = b;
    }

    public void area() {
        System.out.println("area of tringle is:" + (h * b));
    }
}

class Square extends shape {
    Square(double s) {
        this.s = s;
    }

    public void area() {
        System.out.println("area of square is:" + (s * s));
    }
}

public class test {
    public static void main(String[] args) {
        circle c = new circle(14.0);
        c.area();
        Triangle t = new Triangle(14, 15);
        t.area();
        Square s = new Square(25);
        s.area();
    }
}