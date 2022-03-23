import java.util.*;
public class StringVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s = sc.nextLine();
        System.out.println("\t---Vowels in Array---");
        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                System.out.println(c);
            }
        }
    }
}
