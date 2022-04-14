// package abstractionandinterfaces;
interface EventListener{
    void performEvent();
}

interface MouseListener extends EventListener{
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}

interface KeyListener extends EventListener{
    void keyPressed();
    void keyReleased();
}

class EventDemo implements MouseListener , KeyListener{

    public void performEvent(){
        System.out.println("Performing an Event");
    }

    public void mouseClicked(){
        System.out.println("Mouse is Clicked");
    }

    public void mousePressed(){
        System.out.println("Mouse is Pressed");
    }

    public void mouseReleased(){
        System.out.println("Mouse is Released");
    }

    public void mouseMoved(){
        System.out.println("Mouse is Moved");
    }

    public void mouseDragged(){
        System.out.println("Mouse is Dragged");
    }

    public void keyPressed(){
        System.out.println("key is Pressed");
    }

    public void keyReleased(){
        System.out.println("key is Released");
    }
}

public class EventListenerPro {
    public static void main(String[] args) {
        EventDemo e =new EventDemo();
        e.keyPressed();        
    }
}
