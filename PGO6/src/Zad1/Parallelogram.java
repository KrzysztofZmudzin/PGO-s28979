package Zad1;

public class Parallelogram implements Figure{

    private double baseSide;
    private double side;
    private double height;

    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide= baseSide;
        this.side= side;
        this.height= height;
    }

    public double getPerimeter() {
        return (2 * baseSide) + (2 * side);
    }
    public double getArea() {
        return baseSide * height;
    }
    public String getType() {
        return "Zad1.Parallelogram";
    }
}
