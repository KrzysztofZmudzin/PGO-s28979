package Zadanie1;

public class Test {
    public static void main(String[] args) {

        Telephone telephone= new Telephone("iPhone", 6.1, "789177669");
        telephone.sendSMS("111222333", "Hello World!");
    }
}
