package Zadanie1;

class Car implements Comparable<Car> {

    private String name;
    private int productionYear;

    public Car(String name, int productionYear) {
        this.name= name;
        this.productionYear= productionYear;
    }

    public String getName() {
        return name;
    }
    public int getProductionYear() {
        return productionYear;
    }

    public int compareTo(Car otherCar) {
        return Integer.compare(this.productionYear, otherCar.productionYear);
    }
}



