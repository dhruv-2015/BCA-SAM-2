public class s6 {
    public static void main(String[] args) {
        
    }
}

class Vehicle {
    int maxSpeed;
    int noOfSheet;

    public void display() {
        System.out.println("max Speed is: " + maxSpeed);
        System.out.println("no Of Sheet is: " + noOfSheet);
    }
}


class Bike extends Vehicle {
    int cc;
    boolean isMoped;
    // Method overriding
    public void display() {
        System.out.println("max Speed is: " + maxSpeed);
        System.out.println("no Of Sheet is: " + noOfSheet);
        System.out.println("CC is: " + cc);
        System.out.println("isMoped: " + isMoped);
    }
}