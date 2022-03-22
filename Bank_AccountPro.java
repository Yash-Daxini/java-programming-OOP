import java.util.*;
class Bank_Account{
    private int Account_No;
    private String User_Name;
    private String Email;
    private String Account_Type;
    private double Account_Balance;

    public void getAccountDetails(int GivenAccountNo,String GivenUserName,String GivenEmail,String GivenAccountType,double GivenAccountBalance){
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Account Number:");
        // int GivenAccountNo = sc.nextInt();
        Account_No = GivenAccountNo;

        // System.out.print("Enter Name:");
        // String GivenUserName = sc.next();
        User_Name = GivenUserName;

        // System.out.print("Enter Email Id:");
        // String GivenEmail = sc.next();
        Email = GivenEmail;

        // System.out.print("Enter Account Type:");
        // String GivenAccountType = sc.next();
        Account_Type = GivenAccountType;

        // System.out.print("Enter Account Balance:");
        // double GivenAccountBalance = sc.nextDouble();
        Account_Balance = GivenAccountBalance;
    }


    public void displayAccountDetails(){
        System.out.println("");
        System.out.println("Account Number : "+Account_No);
        System.out.println("Name : "+User_Name);
        System.out.println("Email Id : "+Email);
        System.out.println("Type : "+Account_Type);
        System.out.println("Balance : "+Account_Balance);
    }
}
public class Bank_AccountPro {
    public static void main(String[] args) {
        Bank_Account one = new Bank_Account();
        one.getAccountDetails(101,"jerry","abc@gmail.com","savings",1100201);
        one.displayAccountDetails();       
    }
}
