package Zadanie2;

import java.util.List;

public class Room {

    private double area;
    private List<Furniture> furnitureList;

    public Room(double area, List<Furniture> furnitureList) {
        this.area= area;
        this.furnitureList= furnitureList;
    }

    public double getTotalPriceIncludingVat() {
        double sum= 0;

        for (int i= 0; i < furnitureList.size(); i++) {
            Furniture a= furnitureList.get(i);
            sum =+ a.getPriceIncludingVat();
        }
        return sum;
    }
}
