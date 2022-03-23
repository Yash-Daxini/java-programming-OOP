import java.util.*;
class MyPoint{
    double x;
    double y;
    MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    MyPoint(Double x,Double y){
        this.x = x;
        this.y = y;
    }
    
    static double distance(MyPoint obj1,MyPoint obj2){
        return Math.sqrt(Math.pow(obj2.x - obj1.x,2) + Math.pow(obj2.y - obj1.y,2));
    }
}

class ThreeDPoint extends MyPoint{
    double z;
    ThreeDPoint(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    ThreeDPoint(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getz(){
        return z;
    }

    static double distance(ThreeDPoint obj1,ThreeDPoint obj2){
        return Math.sqrt(Math.pow(obj2.x - obj1.x,2) + Math.pow(obj2.y - obj1.y,2) + Math.pow(obj2.z - obj1.z,2));
    }
}
public class OOT2 {
    public static void main(String[] args) {
        ThreeDPoint t1 = new ThreeDPoint();
        ThreeDPoint t2 = new ThreeDPoint(10,30,25.5);

        System.out.println("Distance:"+ThreeDPoint.distance(t1, t2));
        System.out.println(t2.getz());
    }
}
