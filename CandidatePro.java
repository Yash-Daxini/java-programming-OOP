import java.util.Scanner;
class Candidate{
    int Candidate_ID;
    String Candidate_Name;
    int Candidate_Age;
    float Candidate_Weight;
    float Candidate_Height;

    public void getCandidateDetails(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Id:");
        int GivenId = sc.nextInt();
        Candidate_ID = GivenId;

        System.out.print("Enter Name:");
        String GivenName = sc.next();
        Candidate_Name = GivenName;

        System.out.print("Enter Age:");
        int GivenAge = sc.nextInt();
        Candidate_Age = GivenAge;

        System.out.print("Enter Weight:");
        Float GivenWeight = sc.nextFloat();
        Candidate_Weight = GivenWeight;

        System.out.print("Enter Height:");
        float GivenHeight = sc.nextFloat();
        Candidate_Height = GivenHeight;
    }

    public void displayCandidateDetails(){
        System.out.println("");
        System.out.println("Id : "+Candidate_ID);
        System.out.println("Name : "+Candidate_Name);
        System.out.println("Age : "+Candidate_Age);
        System.out.println("Weight : "+Candidate_Weight);
        System.out.println("Height : "+Candidate_Height);
    }
}
public class CandidatePro {
    public static void main(String[] args) {
        Candidate Di = new Candidate();
        Di.getCandidateDetails();
        Di.displayCandidateDetails();
    }
}
