package com.theironyard.clt;

import java.util.ArrayList;

/**
 * Created by mac on 4/6/16.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<InventoryItem> items = new ArrayList<>();

        items.add(createItem("T-Shirt", "shirt", 5));
        items.add(createItem("shorts", "pants", 100));
        items.add(createItem("Sandles", "shoe", 10));

        for (InventoryItem item : items) {
            //print out the name, the category, and the quantity
            System.out.printf("Item Name: %s\nItem Category: %s\nQuantity: %s\n\n", item.name, item.category, item.quantity);
        }
    }
    // write your code here
    private static InventoryItem createItem(String name, String category, int quantity) {
        InventoryItem item = null;

        if (category.equalsIgnoreCase("pants")) {
            item = new Pants(name, quantity);
        } else if (category.equalsIgnoreCase("shirt")) {
            item = new Shirt(name, quantity);
        } else if (category.equalsIgnoreCase("shoe")) {
            item = new Shoe(name, quantity);

        }

        return item;
    }
}
