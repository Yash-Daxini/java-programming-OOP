import java.util.*;
public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any String:");
        String s = sc.nextLine();
        int count = 0;
        char [] c = s.toCharArray();
        for(char e : c){
            count++;
        }
        System.out.println("Length Of String:"+count);
    }
}
