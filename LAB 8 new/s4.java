import java.util.Scanner;

public class s4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int real, img;
        ComplexNumber com1 = new ComplexNumber();
        ComplexNumber com2 = new ComplexNumber();
        com1.getInfomation(sc);
        com2.getInfomation(sc);
        ComplexNumber addObj = new ComplexNumber();
        addObj.add(com1, com2);
    }
}

class ComplexNumber {
    int real;
    int img;
    
    ComplexNumber() {

    }
     
    ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public void getInfomation(Scanner sc) {
        System.out.print("Enter Real no: ");
        real = sc.nextInt();
        System.out.print("Enter Imaganary Part: ");
        img = sc.nextInt();
    }

    public void add(ComplexNumber obj1, ComplexNumber obj2) {
        real = obj1.real + obj2.real;
        img = obj1.img + obj2.img;
        System.out.println("Sum of a real number is: " + real + "Sum of imagenary number is: " + img);   
    }

}
