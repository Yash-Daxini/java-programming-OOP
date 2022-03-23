import java.util.*;
class ComplexNumber{
    private int real;
    private int imaginary;

    ComplexNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of complex number:");
        this.real = sc.nextInt();
        System.out.println("Enter imaginary part of complex number:");
        this.imaginary = sc.nextInt();
    }
    ComplexNumber(int givenreal , int givenimaginary){
        this.real = givenreal;
        this.imaginary = givenimaginary;
    }

    static void addObj(ComplexNumber obj1,ComplexNumber obj2){
        System.out.println("Sum Of real parts of Complex Number is:"+(obj1.real+obj2.real));
        System.out.println("Sum Of imaginary parts of Complex Number is:"+ (obj1.imaginary+obj2.imaginary));

    }
}
public class ComplexNumberPro {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber();
        ComplexNumber c2 = new ComplexNumber();
        ComplexNumber.addObj(c1,c2);
        
    }
}
