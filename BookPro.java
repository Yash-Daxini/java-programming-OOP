// package abstractionandinterfaces;
import java.util.Scanner;
class Book{
    private String Author_Name;
    int Id;
    double Prize;

    public void getName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Author Name:");
        Author_Name = sc.nextLine();
    }
}

class Book_Publication extends Book{
    private String Title;

    public void getTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title:");
        Title = sc.nextLine();
    }

    public String displayTitle(){
        return this.Title;
    }
}

class Paper_Publication extends Book{
    private String Title;

    public void getTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title:");
        Title = sc.nextLine();
    }

    public String displayTitle(){
        return this.Title;
    }
}

public class BookPro {
    public static void main(String[] args) {
        Book b = new Book_Publication();
        Book_Publication b1 = new Book_Publication();
        
        b1.getName();
        b1.getTitle();
        System.out.println(b1.displayTitle());

        Book p = new Paper_Publication();
        // p.getTitle();
    }
}
