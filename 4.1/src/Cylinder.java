public class Cylinder extends Circle{
    double height = 4.0;

    Cylinder(){

    }

    Cylinder(double radius){
        this.radius = radius;
    }

    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return this.getArea() * this.getHeight();
    }
}
