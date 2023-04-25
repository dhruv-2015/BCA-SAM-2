class XYZ {
    int l;
    int m;
    int n;

    XYZ() {
    }

    XYZ(int l, int m, int n) {
        this.l = l;
        this.m = m;
        this.n = n;
    }
}

class ABC extends XYZ {
    ABC(int l, int m, int n) {
        super(l, m, n);
    }
}

public class s4 {
    public static void main(String[] args) {
        new ABC(1, 2, 3);
    }
}
