package com.theironyard.clt;

/**
 * Created by Ben on 12/7/16.
 */
public class InventoryItem {
    String name;
    int quantity;
    String category;

    public InventoryItem(String name, int quantity, String category) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }
}
