public class TestCircleAndCilinder {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println(circle.toString());
        System.out.println();

        circle = new Circle(12.0);

        System.out.println(circle.toString());
        System.out.println();

        Cylinder cylinder = new Cylinder();

        cylinder = new Cylinder(13.0);

        System.out.println("Objętość: " + cylinder.getVolume());
        System.out.println();

        cylinder = new Cylinder(14.0, 16.0);

        System.out.println("Objętość: " + cylinder.getVolume());
    }
}