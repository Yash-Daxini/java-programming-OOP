import java.util.*;
class StudentDetails{
    int Enrollment_No;
    String Name;
    int Semester;
    float CPI;

    public void getStudentDetails(){
        System.out.println("\t----Enter Student Details----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Enrollment Number:");
        this.Enrollment_No = sc.nextInt();
        System.out.print("Enter Name:");
        this.Name = sc.next();
        System.out.print("Enter Semester:");
        this.Semester = sc.nextInt();
        System.out.print("Enter CPI:");
        this.CPI = sc.nextFloat();
    }

    public void displayStudentDetails(){
        System.out.println("\t----Student Details----");
        System.out.println("Enrollment Number:"+Enrollment_No);
        System.out.println("Name:"+Name);
        System.out.println("Semester:"+Semester);
        System.out.println("CPI:"+CPI);
    }
}
class StudentDetailsPro{
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails();
        StudentDetails s3 = new StudentDetails();
        StudentDetails s4 = new StudentDetails();
        StudentDetails s5 = new StudentDetails();

        StudentDetails [] students = {s1,s2,s3,s4,s5};
        
        for(StudentDetails s:students){
            s.getStudentDetails();
            s.displayStudentDetails();
        }
    }
}