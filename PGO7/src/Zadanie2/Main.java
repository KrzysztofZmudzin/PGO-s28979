package Zadanie2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item>itemsList= new ArrayList<>();

        itemsList.add(new Item(1, "Przedmiot 1"));
        itemsList.add(new Item(2, "Przedmiot 2"));
        itemsList.add(new Item(3, "Przedmiot 3"));
        itemsList.add(new Item(4, "Przedmiot 4"));
        itemsList.add(new Item(5, "Przedmiot 5"));

        for (Item item : itemsList) {
            item.show();
        }

        HashMap<Integer, String> itemsMap= new HashMap<>();
        for (Item item : itemsList) {
            itemsMap.put(item.getItemId(), item.getItemName());
        }

        for (Map.Entry<Integer, String> entry : itemsMap.entrySet()) {
            int itemId= entry.getKey();
            String itemName= entry.getValue();
            System.out.println("Identyfikator: " + itemId + ", Nazwa przedmiotu: " + itemName);
        }
    }
}
