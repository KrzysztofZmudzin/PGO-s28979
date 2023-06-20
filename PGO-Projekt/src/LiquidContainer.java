import java.util.Scanner;

public class LiquidContainer extends BasicContainer implements Explosible {

    private boolean dangerousLiquid;

    public LiquidContainer(double cargoMass, double height, double length, double maxCargoMass, boolean dangerousLiquid) {
        super(cargoMass, height, length, maxCargoMass);
        this.dangerousLiquid= dangerousLiquid;
    }




    public double loadCargo() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How much cargo? (in kg)");
        cargoMass= cargoMass + scanner.nextDouble();
        System.out.println("Is it dangerous liquid? (true/false)");
        dangerousLiquid= scanner.nextBoolean();
        if (!dangerousLiquid) {
            if (cargoMass > 0.9 * maxCargoMass) {
                explode();
                return 1;
            }
        } else {
            if (cargoMass > 0.5 * maxCargoMass) {
                explode();
                return 1;
            }
        }
        return cargoMass;
    }

    public double emptyCargo() {
        return cargoMass= 0;
    }

    public void explode() {
        System.out.println("LiquidContainer with serial numbers: " + serialNumber + " has exploded!");
    }

    public void getSerialNumber() {
        System.out.println(serialNumber);
    }

}
