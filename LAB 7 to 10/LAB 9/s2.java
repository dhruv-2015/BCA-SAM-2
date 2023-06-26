
public class s2 {
    static {
        System.out.println("Running in Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Running in Main method");
    }
}


/*
 * output
 * 
 * PS D:\projects\BCA\SAM 2\JAVA\LAB 9> javac s2.java
 * PS D:\projects\BCA\SAM 2\JAVA\LAB 9> java s2
 * Running in Static Block
 * Running in Main method
 * 
 */