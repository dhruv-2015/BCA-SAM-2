public class s1 {
    public static void main(String[] args) {
        ThisCheck thisCheck = new ThisCheck();
        thisCheck.check();
    }
}

class ThisCheck {
    public static int test = 10;

    public static void test() {
        // System.out.println(this.test);
    }

    public void check() {
        System.out.println(this.test);
    }
}