// package abstractionandinterfaces;
import java.util.Scanner;

abstract class Vegetable{
    String color;
    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color of vegetable:");
        this.color = sc.nextLine();
    }
    abstract String displayColor();
}

class Potato extends Vegetable{
    @Override
    String displayColor(){
        return "Potato's color is "+this.color;
    }
}

class Brinjal extends Vegetable{
    @Override
    String displayColor(){
        return "Brinjal's color is "+this.color;
    }
}

class Tomato extends Vegetable{
    @Override
    String displayColor(){
        return "Tomato's color is "+this.color;
    }
}

public class VegetablePro {
    public static void main(String[] args) {
        Potato p = new Potato();
        Brinjal b = new Brinjal();
        Tomato t = new Tomato();
        p.getDetails();
        b.getDetails();
        t.getDetails();

        System.out.println(p.displayColor());
        System.out.println(b.displayColor());
        System.out.println(t.displayColor());
    }
}
