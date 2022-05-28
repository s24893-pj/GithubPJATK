public class AutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(160, 20000, "red", 10);
        Ford ford = new Ford(156, 4452.0, "black", 2005, 10);
        Ford ford2 = new Ford(155, 5000.0, "pink", 1998, 5);
        Truck truck = new Truck(200, 500000, "gold", 5000);

        System.out.println(sedan.getPurchaseInfo());
        System.out.println(ford.getPurchaseInfo());
        System.out.println(ford2.getPurchaseInfo());
        System.out.println(truck.getPurchaseInfo());
    }
}
