package Zadanie2;

public class Car {

    private String brand;
    private String colour;
    private double engineVolume;

    public Car(String brand, String colour, double engineVolume) {
        setBrand(brand);
        setColour(colour);
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {

        if (engineVolume <= 0) {
            throw new IllegalArgumentException("Engine's volume must be higher than 0");
        }
        this.engineVolume = engineVolume;
    }
    public void highSpeedMotor(double engineVolume) {
        if (engineVolume >= 2) {
            System.out.println("High speed motor");
        }
        if (engineVolume < 2) {
            System.out.println("Low speed motor");
        }
    }
}
