package Exceptions;
import java.util.Scanner;

class NegativeNumber extends Exception {
    @Override
    public String toString() {
        return "This is a negative number";
    }
}

class DivisibleByTen extends Exception {
    @Override
    public String toString() {
        return "This number is Divisible By ten";
    }
}

class GreaterLesser extends Exception {
    @Override
    public String toString() {
        return "This number is greater than 1000 and less than 2000";
    }
}

class Greater extends Exception {
    @Override
    public String toString() {
        return "This number is greater than 7000";
    }
}

public class ExceptionNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total numbers:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        System.out.println("Enter "+n+" numbers");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            try {
                if (a[i] < 0) {
                    throw new NegativeNumber();
                }
                else if(a[i] %10 ==0){
                    throw new DivisibleByTen();
                }
                else if(a[i] > 1000 && a[i] < 2000){
                    throw new GreaterLesser();
                }
                else if(a[i] > 7000){
                    throw new Greater();
                }
                else{
                    sum += a[i];
                }
            } catch (Exception e) {
                continue;
            }
        }
        System.out.println("Sum of "+n+" number is "+sum);
    }
}
