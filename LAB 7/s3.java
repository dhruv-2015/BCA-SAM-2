import java.util.Scanner;

class Bank_Account {
    private int Account_No;
    private String User_Name;
    private String Email;
    private String Account_Type;
    private double Account_Balance;

    public void GetAccountDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account No: ");
        Account_No = sc.nextInt();
        System.out.print("Enter User Name: ");
        User_Name = sc.next();
        System.out.print("Enter Email: ");
        Email = sc.next();
        System.out.print("Enter Account Type: ");
        Account_Type = sc.next();
        System.out.print("Enter Account Balance: ");
        Account_Balance = sc.nextDouble();
        System.out.println("\n");
    }

    public void DisplayAccountDetails() {
        System.out.println("Account No: " + Account_No);
        System.out.println("User Name: " + User_Name);
        System.out.println("Email: " + Email);
        System.out.println("Account Type: " + Account_Type);
        System.out.println("Account Balance: " + Account_Balance);
    }

}

public class s3 {
    public static void main(String[] a) {
        Bank_Account b = new Bank_Account();
        b.GetAccountDetails();
        b.DisplayAccountDetails();
    }
}
