package Zad1;

public class Circle implements Figure{

    private double radius;

    public Circle(double radius) {
        this.radius= radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public String getType() {
        return "Zad1.Circle";
    }
}
