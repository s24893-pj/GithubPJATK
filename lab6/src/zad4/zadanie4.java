package zad4;
import java.util.HashMap;
import java.util.Scanner;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe 1-12");
        int x = scanner.nextInt();
        HashMap<Integer, String> miesiace = new HashMap<Integer, String>();
        miesiace.put(1, "Styczen");
        miesiace.put(2, "Luty");
        miesiace.put(3, "Marzec");
        miesiace.put(4, "Kwiecien");
        miesiace.put(5, "Maj");
        miesiace.put(6, "Czerwiec");
        miesiace.put(7, "Lipiec");
        miesiace.put(8, "Sierpien");
        miesiace.put(9, "Wrzesien");
        miesiace.put(10, "Pazdziernik");
        miesiace.put(11, "Listopad");
        miesiace.put(12, "Grudzien");

        if (x < 13 && x > 0) {
            System.out.println("wybrales miesiac " + miesiace.get(x));
        }else{
            System.out.println("podales zla liczba");
        }
    }
}
