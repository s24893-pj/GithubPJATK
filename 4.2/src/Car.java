interface Purchase{
    String getPurchaseInfo();
}

public class Car {
    int speed;
    double regularPrice;
    String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    Car() {

    }

    double getSalePrice() {
        return this.regularPrice;
    }
}

    class Ford extends Car implements Purchase {
        int year;
        int manufacturerDiscount;

        Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
            super(speed, regularPrice, color);
            this.year = year;
            this.manufacturerDiscount = manufacturerDiscount;
        }

        public String getPurchaseInfo() {
            return "FORD: " + this.getSalePrice();
        }

        @Override
        double getSalePrice() {
            double x = super.getSalePrice() - this.manufacturerDiscount;
            return x;
        }
    }

    class Sedan extends Car implements Purchase{
        int length;

        Sedan(int speed, double regularPrice, String color, int length) {
            super(speed, regularPrice, color);
            this.length = length;
        }

        public String getPurchaseInfo() {
            return "SEDAN: " + this.getSalePrice();
        }

        @Override
        double getSalePrice(){
            if (length > 20)
                return super.getSalePrice() - (0.05 * super.getSalePrice());
            else
                return  super.getSalePrice() - (0.1 * super.getSalePrice());
        }
    }

    class Truck extends Car implements Purchase{
        int weight;

        Truck(int speed, double regularPrice, String color, int weight) {
            super(speed, regularPrice, color);
            this.weight = weight;
        }

        public String getPurchaseInfo() {
            return "TRUCK: " + this.getSalePrice();
        }

        @Override
        double getSalePrice(){
            if (weight > 2000)
                return super.getSalePrice() - (super.getSalePrice() * 0.1);
            else
                return super.getSalePrice();
        }
    }
