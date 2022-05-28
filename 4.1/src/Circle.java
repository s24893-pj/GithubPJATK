public class Circle {
    double radius = 1.0;
    String color = "blue";

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString(){
        return "kolor: " + this.color + "\n" + "pole: " + this.getArea();
    }

}
