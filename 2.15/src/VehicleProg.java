import java.util.Scanner;

 class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(); // 7 pasażerów, 500 pojemność, 6.7 zużycie paliwa
        Vehicle sportsCar = new Vehicle(); // 2 pasażerów, 300 pojemność, 8.6 zużycie paliwa

        miniVan.setPassengers(7);
        miniVan.setFuelcap(500.0f);
        miniVan.setLkm(6.7f);

        sportsCar.setPassengers(2);
        sportsCar.setFuelcap(300.0f);
        sportsCar.setLkm(8.6f);

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj trase w kilometrach do przebycia: ");
        int x = scan.nextInt();

        System.out.format("miniVan potrzebuje %.2f litrów paliwa\n", miniVan.fuelNeed(x));
        System.out.format("sportsCar potrzebuje %.2f litrów paliwa\n", sportsCar.fuelNeed(x));

    }
}
