package com.theironyard.clt;

/**
 * Created by Ultramar on 4/5/16.
 */
public class Shirt extends InventoryItems {
    public Shirt(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "Shirt";
    }
}
