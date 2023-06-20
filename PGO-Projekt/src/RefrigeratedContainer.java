import java.util.ArrayList;
import java.util.List;

public class RefrigeratedContainer extends BasicContainer {

    private double temperature;
    private List<String> products;
    {
        products= new ArrayList<>();
        //s28979
        products.add("ryba");
        products.add("masło");
        products.add("mleko");
        products.add("kiełbaski");
    }

    public RefrigeratedContainer(double cargoMass, double height, double length, double maxCargoMass, double temperature) {
        super(cargoMass, height, length, maxCargoMass);
        this.temperature= temperature;
    }

    public void getSerialNumber() {
        System.out.println(serialNumber);
    }


}
