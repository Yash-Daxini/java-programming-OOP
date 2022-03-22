import java.util.*;
class Employee{
    int Employee_Id;
    String Employee_Name;
    String Designation;
    int Age;
    double Salary;

    public void getAccountDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Id:");
        int GivenId = sc.nextInt();
        Employee_Id = GivenId;

        System.out.print("Enter Name:");
        String GivenName = sc.next();
        Employee_Name = GivenName;

        System.out.print("Enter Designation:");
        String GivenDesignation = sc.next();
        Designation = GivenDesignation;

        System.out.print("Enter Age:");
        int GivenAge = sc.nextInt();
        Age = GivenAge;

        System.out.print("Enter Salary:");
        double GivenSalary = sc.nextDouble();
        Salary = GivenSalary;
    }


    public void displayAccountDetails(){
        System.out.println("");
        System.out.println("Employee Id : "+Employee_Id);
        System.out.println("Name : "+Employee_Name);
        System.out.println("Designation : "+Designation);
        System.out.println("Age : "+Age);
        System.out.println("Salary : "+Salary);
    }
}
public class EmployeePro {
    public static void main(String[] args) {
        Employee raj = new Employee();
        raj.getAccountDetails();
        raj.displayAccountDetails();       
    }   
}
