package z1;
import java.util.*;

public class zadanie1 {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();
        lista.add("Red");
        lista.add("Green");
        lista.add("Black");
        lista.add("Pink");
        lista.add("Orange");

        System.out.println("The oryginal linked list: " + lista);
        System.out.println("Elements removed: "+ lista.removeFirst() + " " + lista.removeLast());
        System.out.println("The new linked list: " + lista);
    }
}
