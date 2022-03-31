class Count{
    static int count=0;
    Count(){
         count++;
    }
}
public class CountNumberOfObjects {
    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        Count c4 = new Count();
        Count c5 = new Count();
        System.out.println(Count.count);
    }
}
