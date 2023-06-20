import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws OverfillException {

        Ship ship1= new Ship(24.5);

        LiquidContainer liquidContainer1= new LiquidContainer(5000, 250, 800, 1000, false);
        RefrigeratedContainer refrigeratedContainer1= new RefrigeratedContainer(3000, 250, 800, 28980, 4);
        GasContainer gasContainer1= new GasContainer(2500, 250, 800, 3000, 2);

        List<Object> containersToAdd= new ArrayList<>();
        containersToAdd.add(liquidContainer1);
        containersToAdd.add(refrigeratedContainer1);
        containersToAdd.add(gasContainer1);
        ship1.addContainers(containersToAdd);

        List<Object> containersToTransfer= new ArrayList<>();
        containersToTransfer.add(liquidContainer1);
        containersToTransfer.add(refrigeratedContainer1);
        containersToTransfer.add(gasContainer1);

        Ship ship2= new Ship(33.3);
        Ship.transferContainers(ship1, ship2, containersToTransfer);

        List<Object> containersToRemove= new ArrayList<>();
        containersToTransfer.add(liquidContainer1);
        containersToTransfer.add(refrigeratedContainer1);
        containersToTransfer.add(gasContainer1);

        ship2.removeContainers(containersToRemove);
    }

}
