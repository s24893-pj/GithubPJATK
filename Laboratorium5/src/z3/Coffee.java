package z3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Coffee {
    public static void main(String[] args) {
        ArrayList<String> coffee = new ArrayList<String>();
        coffee.add("espresso");
        coffee.add("latte");
        coffee.add("cappuccino");
        coffee.add("mocha");
        coffee.add("auLait");
        coffee.add("macchiato");

        Iterator<String> coffes = coffee.iterator();

        System.out.println(coffee);
        
        for (int i = 0; i < 6; i++)
            System.out.println(coffes.next());

        for(String n : coffee)
            System.out.println(n.toUpperCase(Locale.ROOT));

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(coffee.get(i).charAt(j));
            }
            System.out.println();
        }

    }
}

