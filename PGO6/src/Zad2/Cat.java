package Zad2;

public class Cat extends Animal implements Moveable{

    public Cat(String name) {
        super(name);
    }

    public String getType() {
        return "Cat";
    }
    public void start() {
        System.out.println("Cat starts!");
    }
    public void stop() {
        System.out.println("Cat stopped!");
    }
}
