package Client;

import java.util.Scanner;

public class Client implements ClientTemplate{
  private String adres = null;
  private String name = null;
  private String surname = null;

    public Client() {
    }

    public Client(String adres, String name, String surname) {
        this.adres = adres;
        this.name = name;
        this.surname = surname;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void clientData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dane do dostawy:");
        System.out.println("Imie:");
        this.name = scanner.nextLine();
        System.out.println("Nazwisko:");
        this.surname = scanner.nextLine();
        System.out.println("Adres:");
        this.adres = scanner.nextLine();
    }

    public int choosePizza(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz pizze: \n" +
                "1: wegetariańska (szpinak, pomidor, sos, ser)\n" +
                "2: capriciosa (pieczarki, szynka, sos, ser)\n" +
                "3: pepperoni (salami, papryka, sos, ser)\n");
        int type = scanner.nextInt();
        return type;
    }

    public int chooseSize(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz rozmiar pizzy: \n" +
                "1: mala\n" +
                "2: srednia\n" +
                "3: duza\n");
        int rozmiar = scanner.nextInt();
        return rozmiar;
    }

    public boolean isDelivery(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaką formę dostawy wybierasz: ");
        System.out.println("1.Odbiór osobisty\n" +
                "2.Dostawa kurierem na podany adres");
        int delivery = scanner.nextInt();

        if (delivery == 1) {
            return false;
        }
        else if (delivery == 2){
            return true;
        }
        else {
            System.out.println("nie wybrano opcji: opcja domyślna - odbiór osobisty");
            return false;
        }
    }

    public String orderInfo(Pizza pizza){
        if (isDelivery()) {
            pizza.setPrice(pizza.getPrice() + 10);
            System.out.println();
            System.out.println();
            return "wybrano pizze " + pizza.getName() + "\n ze składnikami: " + pizza.getIngredients() +
                    "\n o poziomie ostrości: " + pizza.getSpicy() + "\n" + "Dane klienta: "
                    + "\n" + "Imie: " + this.getName()
                    + "\n" + "Nazwisko: " + this.getSurname()
                    + "\n" + "Adres: " + this.getAdres()
                    + "\n" + "kwota do zapłaty: " + pizza.getPrice()
                    + "\n" + "Średni czas oczekiwania: 45-60 min";
        }else{
            System.out.println();
            System.out.println();
            return "wybrano pizze " + pizza.getName() + "\n ze składnikami: " + pizza.getIngredients() +
                    "\n o poziomie ostrości: " + pizza.getSpicy() + "\n" + "Proszę pojawić się w lokalu około " +
                    "30 minut od złożenia zamówienia" + "\n" + "kwota do zapłaty: " + pizza.getPrice();
        }
    }
}
