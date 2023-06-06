package Zad3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manager manager= new Manager("Jan", "Kowalski", 1990, LocalDate.of(2010,1,1), "PJATK", 2000, 100);
        System.out.println(manager);
    }
}
