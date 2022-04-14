package Exceptions;
import java.util.Scanner;

class InSufficientFundException extends Exception{
    @Override
    public String toString() {
        return "You can\'t withdraw Money because of in Sufficient Balance \n Please Try Again Later";
    }
}

class BankAccount{
    public double AccountBalance=0;

    public void deposit(double Amount){
        AccountBalance += Amount;
        System.out.println("Successfully Deposited "+Amount);
    }

    public void withdraw(double Amount){
        try {
            if(AccountBalance < Amount){
                throw new InSufficientFundException();
            }
            else{
                AccountBalance -= Amount;
                System.out.println("Successfully WithDrawed "+Amount);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class ExceptionBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BankAccount b = new BankAccount();

        System.out.print("Enter Amount you want to Deposit:");
        double d = sc.nextDouble();

        b.deposit(d);

        System.out.print("Enter Amount you want to withdraw:");
        double w = sc.nextDouble();

        b.withdraw(w);
    }
}
