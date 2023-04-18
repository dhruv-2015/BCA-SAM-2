public class s1_3 {
    public static void main(String[] args) {
        Car2 carObj = new Car2();
        carObj.hp = 20;
        carObj.maxSpeed = 200;
        carObj.noOfSheet = 4;
        carObj.powerSteering = true;
        carObj.safetyRating = 8;
        carObj.display();
    }
}

class Vehicle {
    int maxSpeed;
    int noOfSheet;
}

class Car extends Vehicle {
    int hp;
    boolean powerSteering;
}


class Car2 extends Car {
    int safetyRating;
    
    public void display() {
        System.out.println("max Speed is: " + maxSpeed);
        System.out.println("no Of Sheet is: " + noOfSheet);
        System.out.println("hp is: " + hp);
        System.out.println("powerSteering: " + powerSteering);
        System.out.println("safetyRating: " + safetyRating);
    }
}