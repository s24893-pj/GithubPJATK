package Client;

public interface ClientTemplate {
    void clientData();
    int choosePizza();
    int chooseSize();
    boolean isDelivery();
    String orderInfo(Pizza pizza);
}
