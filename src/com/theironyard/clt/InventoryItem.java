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

    @Override
    public String toString() {
        System.out.printf("\nThe brand name is %s, The quantity is %d, The category is %s", name, quantity, category);
        return "";
    }

}