package Logic;

import Client.Client;
import Client.Pizza;

public class Pizzeria {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Client client = new Client();

        client.clientData();

        pizza.pizzaInfo(client);

        System.out.println(client.orderInfo(pizza));
    }
}