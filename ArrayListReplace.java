// package Lab12_class;
import java.util.ArrayList;

public class ArrayListReplace {
    public static void main(String[] args) {
        
        ArrayList <String> a = new ArrayList<>();

        a.add("Delhi");
        a.add("Mumbai");
        a.add("Bangalore");
        a.add("Hyderabad");
        a.add("Ahmedabad");

        System.out.println("\tElements of Array List");

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }

        a.set(4, "Surat");
        System.out.println();

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }
}
