package Zadanie2;

class Item {
    private int itemId;
    private String itemName;

    public Item(int itemId, String itemName) {
        this.itemId= itemId;
        this.itemName= itemName;
    }

    public void show() {
        System.out.println("Nazwa przedmiotu: " + itemName);
    }
    public int getItemId() {
        return itemId;
    }
    public String getItemName() {
        return itemName;
    }
}
