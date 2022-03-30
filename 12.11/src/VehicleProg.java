public class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(); // 7 pasażerów, 500 pojemność, 6.7 zużycie paliwa
        Vehicle sportsCar = new Vehicle(); // 2 pasażerów, 300 pojemność, 8.6 zużycie paliwa

        miniVan.passengers = 7;
        miniVan.fuelcap = 500.0f;
        miniVan.lkm = 6.7f;

        sportsCar.passengers = 2;
        sportsCar.fuelcap = 300.0f;
        sportsCar.lkm = 8.6f;

        System.out.println("MiniVan zasięg: " + (miniVan.fuelcap/miniVan.lkm*100) + "km" );
        System.out.println("sportsCar zasięg: " + (sportsCar.fuelcap/sportsCar.lkm*100) + "km" );
    }
}
