package Zadanie3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item>itemList= new ArrayList<>();

        for (int i= 1; i<= 10; i++) {
            itemList.add(new Item(i, "Przedmiot " + i));
        }

        List<Item>sublist= itemList.subList(0, 5);

        HashSet<Item>itemSet= new HashSet<>(sublist);

        for (Item item : itemSet) {
            System.out.println("Identyfikator: " + item.getItemId() + ", Nazwa przedmiotu: " + item.getItemName());
        }
    }
}
