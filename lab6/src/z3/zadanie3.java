package z3;
import java.util.*;

public class zadanie3 {
    public static void main(String[] args) {
        TreeSet<String> tree1 = new TreeSet<>();
        System.out.println();
        tree1.add("Black");
        tree1.add("Green");
        tree1.add("Orange");
        tree1.add("Red");
        tree1.add("White");
        System.out.println("drzewo1: " + tree1);

        Iterator<String> tree1it = tree1.iterator();
        for (String element : tree1) {
            System.out.println(tree1it.next());
        }

        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Black");
        tree2.add("Pink");
        tree2.add("White");

        tree1.addAll(tree2);

        System.out.println();
        System.out.println("Drzewo po sumie: " + tree1);
        System.out.println();


        System.out.println("tree1 w odwrotnej kolejności:");
        System.out.println(tree1.descendingSet());
        System.out.println();

        System.out.println("pierwszy element drzewa tree1: " + tree1.first()); // e
        System.out.println("ostatni element drzewa tree1: " + tree1.last());
        System.out.println();

        TreeSet<String> tree3 = (TreeSet) tree1.clone();

        System.out.println("drzewo3: " + tree3);
        System.out.println();

        System.out.println("liczba elementow w drzewie tree1: " + tree1.size());
        System.out.println();

        String arr1[] = new String[6];
        arr1 = tree1.toArray(arr1);

        String arr2[] = new String[6];
        arr2 = tree2.toArray(arr2);

        System.out.println("porównanie drzew tree1 i tree2:");
       // for(int i = 0; i < 6; i++) {
       //     System.out.println(arr1[i].equals(arr2[i]));
       // }
        for(int i = 0; i < 6; i++) {
            if(arr1[i].equals(arr2[i]) == true){
                System.out.println((i+1) + " element drzewa 1 i 2 jest równy");
            }else
                System.out.println((i+1) + " element drzewa 1 i 2 nie jest równy");
        }
    }
}
