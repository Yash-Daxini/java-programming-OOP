// package Lab12_class;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSubList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> a1 = new ArrayList<>();

        a.add("Aarav");
        a.add("Kabir");
        a.add("Vivaan");
        a.add("Ayaan");
        a.add("Aditya");

        System.out.println("\tOriginal Array List");

        for (String string : a) {
            System.out.print(string + " ");
        }

        for (String e : a) {
            if(e.charAt(0) == 'A'){
                a1.add(e);
            }                
        }

        System.out.println();
        System.out.println("\tSub Array List");

        for (String string : a1) {
            System.out.print(string + " ");
        }
    }
}
