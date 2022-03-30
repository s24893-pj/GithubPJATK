public class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(); // 7 pasażerów, 500 pojemność, 6.7 zużycie paliwa
        Vehicle sportsCar = new Vehicle(); // 2 pasażerów, 300 pojemność, 8.6 zużycie paliwa

        miniVan.setPassengers(7);
        miniVan.setFuelcap(500.0f);
        miniVan.setLkm(6.7f);

        sportsCar.setPassengers(2);
        sportsCar.setFuelcap(300.0f);
        sportsCar.setLkm(8.6f);

        System.out.println("MiniVan przewozi " + miniVan.getPassengers() + " pasażerów.");
        miniVan.range();
        System.out.println("sportsCar przewozi " + sportsCar.getPassengers() + " pasażerów.");
        sportsCar.range();

    }
}