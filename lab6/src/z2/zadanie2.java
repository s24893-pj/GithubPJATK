package z2;
import java.util.*;

public class zadanie2 {
    public static void main(String[] args) {
        HashSet<String> lista = new HashSet<>();
        lista.add("Red");
        lista.add("Green");
        lista.add("Black");
        lista.add("Pink");
        lista.add("Orange");

        System.out.println(lista);
        String[] tablica = new String[lista.size()];

        int i = 0;

        for(String element:lista){
            tablica[i++] = element;
        }
        for(String element:tablica){
            System.out.println(element);
        }
    }
}
