public class Telephone {

    private String brand;
    private double screenSize;
    private String number;

    public Telephone(String brand, double screenSize, String number) {
        this.brand= brand;
        this.screenSize= screenSize;
        this.number= number;
    }

    public void sendSMS(String toWhatNumber, String textMessage) {
        System.out.println("Wysyłam SMS do numeru " + toWhatNumber + " o treści " + textMessage);
    }
}
