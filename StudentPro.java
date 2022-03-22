import java.util.*;
class Student{
    int Enrollment_No;
    String Student_Name;
    int Semester;
    float CPI;
    float SPI;

    public void getStudentDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Enrollment Number:");
        int GivenEnrollment = sc.nextInt();
        Enrollment_No = GivenEnrollment;

        System.out.print("Enter Name:");
        String GivenName = sc.next();
        Student_Name = GivenName;

        System.out.print("Enter Semester:");
        int GivenSemester = sc.nextInt();
        Semester = GivenSemester;

        System.out.print("Enter CPI:");
        float GivenCPI = sc.nextFloat();
        CPI = GivenCPI;

        System.out.print("Enter SPI:");
        float GivenSPI = sc.nextFloat();
        SPI = GivenSPI;
    }
    public void displayStudentDetails(){
        System.out.println("");
        System.out.println("Enrollment Number : "+Enrollment_No);
        System.out.println("Name : "+Student_Name);
        System.out.println("Semester : "+Semester);
        System.out.println("CPI : "+CPI);
        System.out.println("SPI : "+SPI);
    }
}
public class StudentPro {
    public static void main(String[] args) {
        Student s = new Student();
        s.getStudentDetails();
        s.displayStudentDetails();
    }
}
