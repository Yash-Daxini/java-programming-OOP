import java.util.*;
class Member{
    String Name;
    int Age;
    long Phonenumber;
    String Address;
    double Salary;

    public void printSalary(){
        System.out.println("Salary:"+Salary);
    }
}
class Employee extends Member{
    String Specialization;
    String Department;
    
    public void getMemberDetails(){
        System.out.println("\t----Enter Employee Details----");
        System.out.print("Enter Name:");
        Scanner sc=new Scanner(System.in);
        this.Name = sc.next();
        System.out.print("Enter Age:");
        this.Age = sc.nextInt();
        System.out.print("Enter Phone Number:");
        this.Phonenumber = sc.nextLong();
        System.out.print("Enter Address:");
        this.Address = sc.next();
        System.out.print("Enter Salary:");
        this.Salary = sc.nextDouble();
        System.out.print("Enter Specialization:");
        this.Specialization = sc.next();
        System.out.print("Enter Department:");
        this.Department = sc.next();        
    }
    
    public void displayMemberDetails(){
        System.out.println("\t----Employee Details----");
        System.out.println("Name:"+Name);
        System.out.println("Age:"+Age);
        System.out.println("Phone Number:"+Phonenumber);
        System.out.println("Address:"+Address);
        System.out.println("Salary:"+Salary);
        System.out.println("Specialization:"+Specialization);
        System.out.println("Department:"+Department);
    }
}
class Manager extends Member{
    String Specialization;
    String Department;
    
    public void getMemberDetails(){
        System.out.println("\t----Enter Manager Details----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
        this.Name = sc.next();
        System.out.print("Enter Age:");
        this.Age = sc.nextInt();
        System.out.print("Enter Phone Number:");
        this.Phonenumber = sc.nextLong();
        System.out.print("Enter Address:");
        this.Address = sc.next();
        System.out.print("Enter Salary:");
        this.Salary = sc.nextDouble();
        System.out.print("Enter Specialization:");
        this.Specialization = sc.next();
        System.out.print("Enter Department:");
        this.Department = sc.next();
    }

    public void displayMemberDetails(){
        System.out.println("\t----Manager Details----");
        System.out.println("Name:"+Name);
        System.out.println("Age:"+Age);
        System.out.println("Phone Number:"+Phonenumber);
        System.out.println("Address:"+Address);
        System.out.println("Salary:"+Salary);
        System.out.println("Specialization:"+Specialization);
        System.out.println("Department:"+Department);
    }
}
public class OOT1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.getMemberDetails();
        m.displayMemberDetails();
        Employee e = new Employee();
        e.getMemberDetails();
        e.displayMemberDetails();
    }
}
