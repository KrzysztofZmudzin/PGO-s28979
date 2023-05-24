package Animals;

public class Animal {
    public static void main(String[] args) {

        System.out.println("Dog:");
        Dog dog= new Dog();
        dog.makeNoise();
        dog.sleep();
        dog.roam();

        System.out.println("Lion:");
        Lion lion= new Lion();
        lion.makeNoise();
        lion.sleep();
        lion.roam();
    }

    public void sleep() {
        System.out.println("*Sleeping*");
    }
    public void makeNoise() {
        System.out.println("*Making noises*");
    }
    public void roam() {
        System.out.println("*Roaming*");
    }
}
