package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

class NonNumeric extends Exception {
    @Override
    public String toString() {
        return "Wrong Operand Type! Please Enter numeric data";
    }
}

class NonOperatorSymbol extends Exception {
    @Override
    public String toString() {
        return "Invalid Operator ! Please input correct Operator from + , - , * , / ";
    }
}

public class ExceptionCalc {
    static int i = 1;

    static Long getInputOperand() throws NonNumeric {
        Scanner sc = new Scanner(System.in);
        Long a = 0l;
        String s = "";

        try {
            System.out.print("Enter " + i + " Operand :");
            a = sc.nextLong();
            i++;
        }

        catch (Exception e) {
            s = e.toString();
        }

        if (s == "java.util.InputMismatchException") {
            throw new NonNumeric();
        }

        else {
            return a;
        }
    }

    static char getInputOperation() throws NonOperatorSymbol {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Opration you want to perform:");

        char c = sc.next().charAt(0);

        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return c;
        }
    
        else{
            throw new NonOperatorSymbol();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        try {
            Long a = getInputOperand();
            Long b = getInputOperand();
            char choice = getInputOperation();

            switch (choice) {
                case '+':
                    System.out.println(a + b);
                    break;

                case '-':
                    System.out.println(a - b);
                    break;

                case '*':
                    System.out.println(a * b);
                    break;

                case '/':
                    System.out.println(a / b);
                    break;
            }
        }

        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
