package Zadanie3;

class Item {

    private int itemId;
    private String itemName;

    public Item(int itemId, String itemName) {
        this.itemId= itemId;
        this.itemName= itemName;
    }
    public int getItemId() {
        return itemId;
    }
    public String getItemName() {
        return itemName;
    }
}