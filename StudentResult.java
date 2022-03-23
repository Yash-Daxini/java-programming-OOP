import java.util.*;
class Student{
    int Enrollment_NO;
    String Student_Name;
    int Semester;

    public void getStudentDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Enrollment Number:");
        this.Enrollment_NO = sc.nextInt();
        System.out.print("Enter Name:");
        this.Student_Name = sc.next();
        System.out.print("Enter Semester:");
        this.Semester = sc.nextInt();
    }
}
class Result extends Student{
    float CPI;
    float SPI;
    
    public void getResultDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CPI:");
        this.CPI = sc.nextFloat();
        System.out.print("Enter SPI:");
        this.SPI = sc.nextFloat();
    }

    public void displayResult(){
        System.out.println("\t----Result Details----");
        System.out.println("Enrollment Number:"+Enrollment_NO);
        System.out.println("Name:"+Student_Name);
        System.out.println("Semester:"+Semester);
        System.out.println("CPI:"+CPI);
        System.out.println("SPI:"+SPI);
    }
}
public class StudentResult {
    public static void main(String[] args) {
        Result s1 = new Result();
        s1.getStudentDetails();
        s1.getResultDetails();
        s1.displayResult();
    }
}
