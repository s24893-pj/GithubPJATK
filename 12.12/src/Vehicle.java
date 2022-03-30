public class Vehicle {
    private int passengers;
    private float fuelcap;
    private float lkm;

    public void setPassengers(int passengersParameter){
        passengers = passengersParameter;
    }

    public int getPassengers(){
        return passengers;
    }

    public void setFuelcap(float fuelcapParameter){
        fuelcap = fuelcapParameter;
    }

    public float getFuelcap(){
        return fuelcap;
    }

    public void setLkm(float lkmParameter){
        lkm = lkmParameter;
    }

    public float getLkm(){
        return lkm;
    }

    public void range(){
        System.out.println("Zasięg: " + (fuelcap / lkm*100) + "km");
    }
}
