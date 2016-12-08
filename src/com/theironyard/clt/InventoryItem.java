package com.theironyard.clt;

public class InventoryItem {
    String name;
    int quantity;
    String category;

    public InventoryItem(String name, int quantity, String category) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }
     void showList() {
        System.out.printf(" why is it in all caps? %s %S\n", quantity, name);
    }
}
