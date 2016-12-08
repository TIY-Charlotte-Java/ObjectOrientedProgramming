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
    //Overridden the toString method to allow the main method to print to console correct objects using .get
    @Override
    public String toString() {
        System.out.printf("\nThe brand name is %s, The quantity is %d, The category is %s", name, quantity, category);
        return "";
    }

}