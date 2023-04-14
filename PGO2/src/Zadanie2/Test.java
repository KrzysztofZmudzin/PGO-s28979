package Zadanie2;

public class Test {
    public static void main(String[] args) {

        Car car1= new Car("Mercedes", "Black", 6.2);
        car1.setEngineVolume(4);
        double vol1= car1.getEngineVolume();
        System.out.println(car1.getBrand() + " " + car1.getColour() + " " + car1.getEngineVolume());
        car1.highSpeedMotor(vol1);

        Car car2= new Car("Toyota", "Camry", 1.8);
        double vol2= car2.getEngineVolume();
        System.out.println(car2.getBrand() + " " + car2.getColour() + " " + car2.getEngineVolume());
        car2.highSpeedMotor(vol2);
    }
}
