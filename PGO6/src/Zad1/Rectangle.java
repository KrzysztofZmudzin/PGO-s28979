package Zad1;

public class Rectangle implements Figure{

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA= sideA;
        this.sideB= sideB;
    }

    public double getPerimeter() {
        return (2 * sideA) + (2 * sideB);
    }
    public double getArea() {
        return sideA * sideB;
    }
    public String getType() {
        return "Zad1.Rectangle";
    }
}
