package src;
import java.util.Scanner;
abstract class Book {
    String title;

    String getTitle() {
        return title;
    }

    abstract void setTitle(String s);

}

class MyBook extends Book {

    @Override
    void setTitle(String s) {
        title = s;
    }
}
public class ClasseAbstrata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("O titulo é " + new_novel.getTitle());
        sc.close();

    }
}

