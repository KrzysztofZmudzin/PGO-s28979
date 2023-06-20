import java.util.ArrayList;
import java.util.List;

public class Ship {

    private List<Object> containers;
    private double maxSpeed;
    private int maxContainerQuantity;
    {
        maxContainerQuantity= 28979/5;
    }

    public Ship(double maxSpeed) {
        this.containers= new ArrayList<>();
        this.maxSpeed= maxSpeed;
    }

    public void addContainer(Object container) {
        if (containers.size() < maxContainerQuantity) {
            containers.add(container);
            System.out.println("Dodano kontener: " + container);
        } else {
            System.out.println("Nie można dodać kontenera- osiągnięto maksymalną ilość kontenerów.");
        }
    }

    public void addContainers(List<Object> newContainers) {
        if (containers.size() + newContainers.size() <= maxContainerQuantity) {
            containers.addAll(newContainers);
            System.out.println("Dodano kontenery: " + newContainers);
        } else {
            System.out.println("Nie można dodać kontenerów - osiągnięto maksymalną ilość kontenerów.");
        }
    }

    public void removeContainer(Object container) {
        if (containers.remove(container)) {
            System.out.println("Usunięto kontener: " + container);
        } else {
            System.out.println("Kontener nie istnieje na tym statku kontenerowym.");
        }
    }

    public void removeContainers(List<Object> containersToRemove) {
        containers.removeAll(containersToRemove);
        System.out.println("Usunięto kontenery: " + containersToRemove);
    }

    public void swapContainer(int position, Object newContainer) {
        if (position >= 0 && position < containers.size()) {
            Object removedContainer= containers.set(position, newContainer);
            System.out.println("Zamieniono kontener na pozycji " + position + ": " + removedContainer + " na " + newContainer);
        } else {
            System.out.println("Nieprawidłowa pozycja kontenera.");
        }
    }

    public static void transferContainers(Ship sourceShip, Ship destinationShip, List<Object> containersToTransfer) {
        if (sourceShip.containers.containsAll(containersToTransfer)) {
            sourceShip.containers.removeAll(containersToTransfer);
            destinationShip.containers.addAll(containersToTransfer);
            System.out.println("Przeniesiono kontenery: " + containersToTransfer + " z statku " + sourceShip + " na statek " + destinationShip);
        } else {
            System.out.println("Niektóre kontenery nie istnieją na źródłowym statku kontenerowym.");
        }
    }

    public static Ship createShip(double maxSpeed) {
        return new Ship(maxSpeed);
    }
}
