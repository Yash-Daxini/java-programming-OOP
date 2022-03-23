import java.util.*;
class Circle{
    float r;

    public double area(float r){
        return Math.PI*r*r;        
    }
    public double perimeter(float r){
        return Math.PI*r*2;
    }
}
public class CirclePro {
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius:");
        float r = sc.nextFloat();
        System.out.println(c.area(r));
        System.out.println(c.perimeter(r));
    }
}
