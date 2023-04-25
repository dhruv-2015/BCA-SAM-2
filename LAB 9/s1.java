class DemoThisKey {
    int a;
    int b;
    static int c = 10;

    DemoThisKey(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = 11;
    }

    public void display() {
        System.out.println("A is: " + this.a);
        System.out.println("B is: " + this.b);
        System.out.println("C is: " + this.c);
    }
}


public class s1 {
    public static void main(String[] args) {
        DemoThisKey obj = new DemoThisKey(10, 11);
        obj.display();
    }
}
