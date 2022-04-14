package Lab12_class;
import java.util.*;
import java.util.jar.Attributes.Name;

class Loan{
    Double Amount;
    String Name;

    Loan(Double Amount,String Name){
        this.Amount = Amount;
        this.Name = Name;
    }

    public String toString(){
        return  "Amount :" + " " + Amount + 
                "  " + "Name :" + "  " + Name;
    }

    
}

class Date{
    int Day;
    int Month;
    int Year;

    Date(int Day,int Month,int Year){
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }

    public String toString(){
        return "Day = " + Day + " "  + "Month = " + Month + " " + "Year = " + Year + " " ;
    }
}

class Circle{
    Float Radius;

    Circle(Float Radius){
        this.Radius = Radius;
    }

    @Override
    public String toString(){
        return "Radius = " + Radius ;  
    }
}
public class ArrayListOfObject {
    public static void main(String[] args) {

        Loan l = new Loan(50000.456, "JBL");

        Date d = new Date(4, 4, 2022);

        Circle c = new Circle(45.5f);

        String s = new String("ArraList");

        ArrayList<String> a = new ArrayList<>();

        a.add(String.valueOf(l));
        a.add(String.valueOf(d));
        a.add(s);
        a.add(String.valueOf(c));

        for (Object object : a) {
            System.out.println(object);
        }
    }
    
}
