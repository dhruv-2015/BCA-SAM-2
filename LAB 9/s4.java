class XYZ {
    int a;
    int b;
    int c;

    XYZ() {
    }

    XYZ(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class ABC extends XYZ {
    ABC(int a, int b, int c) {
        super(a, b, c);
    }
}

public class s4 {
    public static void main(String[] args) {
        new ABC(1, 2, 3);
    }
}
