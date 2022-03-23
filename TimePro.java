import java.util.*;
class Time{
    private int minute;
    private int hour;

    Time(int givenminute,int givenhour){
        this.minute = givenminute;
        this.hour  = givenhour;
    }

    static void TimeObjSum(Time obj1 , Time obj2){
        System.out.println("Sum of Minutes:"+(obj1.minute + obj2.minute)); 
        System.out.println("Sum of Hours:"+(obj1.hour + obj2.hour));
    }
}
public class TimePro {
    public static void main(String[] args) {
        Time t1 = new Time(15,17);
        Time t2 = new Time(15,12);
        Time.TimeObjSum(t1 , t2);
    }
}
