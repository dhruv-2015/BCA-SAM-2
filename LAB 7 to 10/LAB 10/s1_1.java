public class s1_1 {
    public static void main(String[] args) {
        Bike bikeObj = new Bike();
        bikeObj.maxSpeed = 180;
        bikeObj.isMoped = false;
        bikeObj.cc = 2;
        bikeObj.noOfSheet = 2;
        bikeObj.display();
    }
}

class Vehicle {
    int maxSpeed;
    int noOfSheet;
    
}

class Bike extends Vehicle {
    int cc;
    boolean isMoped;
    
    public void display() {
        System.out.println("max Speed is: " + maxSpeed);
        System.out.println("no Of Sheet is: " + noOfSheet);
        System.out.println("CC is: " + cc);
        System.out.println("isMoped: " + isMoped);
    }
}

