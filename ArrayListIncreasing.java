// package Lab12_class;
import java.util.*;

public class ArrayListIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<>(5);

        System.out.println("Enter Array List Elements:");
        for (int i = 0; i < 5; i++) {
            a1.add(sc.nextInt());
        }


        System.out.println("Elements of the ArrayList:");
        int temp;
        for(int i = 0;i<a1.size()-1;i++){
            for(int j = i+1;j<a1.size();j++){
                if(a1.get(i) > a1.get(j)){
                    temp = a1.get(i);
                    a1.set(i,a1.get(j));
                    a1.set(j,temp);
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(a1.get(i) + " ");
        }
    }
}
