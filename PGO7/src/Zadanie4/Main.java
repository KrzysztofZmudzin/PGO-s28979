package Zadanie4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array= new int[10];

        fillArray(array);

        System.out.println("Zawartość tablicy: ");
        for (int num : array) {
            System.out.println(num);
        }
    }

    public static int readNumber() throws NegativeNumberException {

        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();

        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }

        return number;
    }

    public static void fillArray(int[] array) {

        System.out.println("Podaj 10 liczb nie-ujemnych: ");

        for (int i= 0; i< array.length; i++) {
            try {
                array[i]= readNumber();
            } catch (NegativeNumberException e) {
                System.out.println("Wyjątek: " + e.getMessage());
                array[i]= 0;
            }
        }
    }
}
