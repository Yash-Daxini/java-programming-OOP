// package abstractionandinterfaces;

interface Transport{
    void deliver();
}

abstract class Animal{
    String name;
    abstract String display();
}

class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Camel Helps to Deliver in Desert");
    }

    public String display(){
        return "Camel";
    }
}

class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Donkey Helps to Deliver in Forest");
    }

    public String display(){
        return "Donkey";
    }
}

public class TransportPro {
    public static void main(String[] args) {
        Camel c = new Camel();
        Donkey d = new Donkey();
        c.deliver();
        d.deliver();
        System.out.println(c.display());
        System.out.println(d.display());
    }   
}
