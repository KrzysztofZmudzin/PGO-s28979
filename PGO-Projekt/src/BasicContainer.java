import java.util.Random;
import java.util.Scanner;

abstract class BasicContainer {

    protected double cargoMass;
    protected double height;
    protected double length;
    protected int serialNumber;
    {
        Random random= new Random();
        serialNumber= random.nextInt(27980);
    }
    protected double maxCargoMass;

    public BasicContainer(double cargoMass, double height, double length, double maxCargoMass) {
        this.cargoMass= cargoMass;
        this.height= height;
        this.length= length;
        this.maxCargoMass= maxCargoMass;
    }

    public double loadCargo() throws OverfillException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How much cargo? (in kg)");
        cargoMass= scanner.nextDouble();
        if (cargoMass > maxCargoMass) {
            throw new OverfillException("Przekroczono maksymalną wagę ładunku!");
        }
        return cargoMass;
    }

    public double emptyCargo() {
        return cargoMass= 0;
    }

    public void getSerialNumber() {
        System.out.println(serialNumber);
    }
}
