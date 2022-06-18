package Client;

public class Pizza implements PizzaTemplate{
   private String name = null;
   private String ingredients = null;
   private int spicy = 0;
   private int price = 0;

    public Pizza(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getSpicy() {
        return spicy;
    }

    public void setSpicy(int spicy) {
        this.spicy = spicy;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Pizza(String name, String ingredients, int spicy, int price) {
        this.name = name;
        this.ingredients = ingredients;
        this.spicy = spicy;
        this.price = price;
    }

        public void pizzaInfo(Client client){
            switch (client.choosePizza()){
                case 1:
                    this.setName("Wegetariańska");
                    this.setIngredients("szpinak, pomidor, sos, ser");
                    this.setSpicy(0);
                    switch (client.chooseSize()){
                        case 1:
                            this.setPrice(25);
                            break;
                        case 2:
                            this.setPrice(30);
                            break;
                        case 3:
                            this.setPrice(35);
                            break;
                        default:
                            System.out.println("nie podano rozmiaru");
                            break;
                    }
                    break;
                case 2:
                    this.setName("Capriciosa");
                    this.setIngredients("pieczarki, szynka, sos, ser");
                    this.setSpicy(1);
                    switch (client.chooseSize()){
                        case 1:
                            this.setPrice(28);
                            break;
                        case 2:
                            this.setPrice(33);
                            break;
                        case 3:
                            this.setPrice(38);
                            break;
                        default:
                            System.out.println("nie podano rozmiaru");
                            break;
                    }
                    break;
                case 3:
                    this.setName("Pepperoni");
                    this.setIngredients("salami, papryka, sos, ser");
                    this.setSpicy(2);
                    switch (client.chooseSize()) {
                        case 1:
                            this.setPrice(30);
                            break;
                        case 2:
                            this.setPrice(35);
                            break;
                        case 3:
                            this.setPrice(40);
                            break;
                        default:
                            System.out.println("nie podano rozmiaru");
                            break;
                    }
                    break;
                default:
                    System.out.println("nie wybrano pizzy");
                    break;
            }
        }
    }

