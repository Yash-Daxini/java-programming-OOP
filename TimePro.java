class Time{
    private int minute;
    private int hour;

    Time(int givenhour,int givenminute){
        this.minute = givenminute;
        this.hour  = givenhour;
    }

    static void TimeObjSum(Time obj1 , Time obj2){
        int summinutes = (obj1.minute + obj2.minute);
        int sumhours = (obj1.hour + obj2.hour);
        if(summinutes > 60){
            sumhours += summinutes/60;
            summinutes -= (summinutes/60)*60;
        }
        System.out.println(sumhours+" : "+summinutes); 
    }
}
public class TimePro {
    public static void main(String[] args) {
        Time t1 = new Time(1,40);
        Time t2 = new Time(4,60);
        Time.TimeObjSum(t1 , t2);
    }
}
