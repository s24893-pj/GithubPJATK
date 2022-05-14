import java.util.logging.Logger;

public class Circle {
    double radius;
    String color;

    Circle(){
        this.radius = 10.0;
        this.color = "white";
    }

    Circle(double radius){
        this.radius = radius;
        this.color = "white";
    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }
    @Override
    public String toString() {
        return "The circle " + " " + "has raduis of " + getRadius() + " and area of " + getArea() + " and color of "
        + this.color + "\n" + "Circle: radius = " + getRadius() + " color = " + getColor();
    }
}
