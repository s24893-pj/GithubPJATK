import java.util.logging.Logger;

public class TestCircle {
        public static void main(String[] args) {
            Circle circle = new Circle();

            System.out.println(circle.toString());;

            circle = new Circle(14.0);

            System.out.println(circle.toString());;

            circle = new Circle(14.0, "red");

            System.out.println(circle.toString());;

            circle = new Circle();

            circle.setColor("blue");
            circle.setRadius(17.0);

            System.out.println(circle.toString());;
        }
    }
