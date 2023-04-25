public class s1_2 {
    public static void main(String[] args) {
        Bike bikeObj = new Bike();
        bikeObj.maxSpeed = 180;
        bikeObj.isMoped = false;
        bikeObj.cc = 2;
        bikeObj.noOfSheet = 2;
        bikeObj.display();

        Car carObj = new Car();
        carObj.hp = 20;
        carObj.maxSpeed = 200;
        carObj.noOfSheet = 4;
        carObj.powerSteering = true;
        carObj.display();
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

class Car extends Vehicle {
    int hp;
    boolean powerSteering;

    public void display() {
        System.out.println("max Speed is: " + maxSpeed);
        System.out.println("no Of Sheet is: " + noOfSheet);
        System.out.println("hp is: " + hp);
        System.out.println("powerSteering: " + powerSteering);
    }
}