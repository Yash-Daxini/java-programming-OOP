import java.util.Scanner;
import java.lang.String;
public class DecimalToFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal number:");
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0;i < s.length();i++ ){
            if(s.charAt(i) != '.'){
                count++;
            }
            else{
                break;
            }
        }
        System.out.println("Decimal Part");
        System.out.println("");
        for(int i = 0 ; i < count ;i++){
            System.out.print(s.charAt(i));
        }
        System.out.println("");
        System.out.println("Fractional Part");
        System.out.println("");
        for(int i = count+1 ; i < s.length() ;i++){
            System.out.print(s.charAt(i));
        }
    }
}
