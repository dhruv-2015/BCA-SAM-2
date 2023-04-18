import java.util.Scanner;

class Candidate {

    private int Candidate_ID;
    private String Candidate_Name;
    private int Candidate_Age;
    private double Candidate_Weight;
    private double Candidate_Height;

    public void GetCandidateDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Candidate ID: ");
        Candidate_ID = sc.nextInt();
        System.out.print("Enter Candidate Name: ");
        sc.nextLine(); // to remove empty line
        Candidate_Name = sc.nextLine();
        System.out.print("Enter Candidate Age: ");
        Candidate_Age = sc.nextInt();
        System.out.print("Enter Candidate Weight: ");
        Candidate_Weight = sc.nextDouble();
        System.out.print("Enter Candidate Height: ");
        Candidate_Height = sc.nextDouble();
    }
    public void DisplayCandidateDetails() {
        System.out.println("Candidate ID: " + Candidate_ID);
        System.out.println("Candidate Name: " + Candidate_Name);
        System.out.println("Candidate Age: " + Candidate_Age);
        System.out.println("Candidate Weight: " + Candidate_Weight);
        System.out.println("Candidate Height: " + Candidate_Height);
    }

}


public class s2 {
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        candidate.GetCandidateDetails();
        System.out.println("\n");
        candidate.DisplayCandidateDetails();
    }
}
