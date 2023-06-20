import java.util.Scanner;

public class GasContainer extends BasicContainer implements Explosible{

    private double pressure;

    public GasContainer(double cargoMass, double height, double length, double maxCargoMass, double pressure) {
        super(cargoMass, height, length, maxCargoMass);
        this.pressure= pressure;
    }

    public double loadCargo() throws OverfillException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How much cargo? (in kg)");
        cargoMass= cargoMass + scanner.nextDouble();
        if (cargoMass > maxCargoMass) {
            explode();
            throw new OverfillException("Przekroczono maksymalną wagę ładunku!");
        }
        return cargoMass;
    }

    public double emptyCargo() {
        return cargoMass= 0.05 * cargoMass;
    }

    public void explode() {
        System.out.println("GasContainer with serial numbers: " + serialNumber + " has exploded!");
    }

    public void getSerialNumber() {
        System.out.println(serialNumber);
    }
}
