import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter any string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = new String();
        boolean flag = false;
        for(int i = 0;i < s.length();i++){
            for(int j = s.length()-1;j>=0;j--){
                if(s.charAt(i) == s.charAt(j)){
                    flag = true;
                }
                else{
                    flag = false;
                }
            }
        }
        if(flag == false) {
            System.out.println("String is not a palindrome.");
        }
        else{
            System.out.println("String is palindrome.");
        }
    }    
}
