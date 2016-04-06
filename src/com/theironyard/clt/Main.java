package com.theironyard.clt;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

            ArrayList<InventoryItem> items = new ArrayList<>();

            items.add(createItem("T-Shirt", "shirts", 5));
            items.add(createItem("Jorts", "pants", 100));
            items.add(createItem("Crocks", "shoes", 10));

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
        } else if (category.equalsIgnoreCase("shirts")) {
           item = new Shirt(name, quantity);
        } else if (category.equalsIgnoreCase("shoes")) {
            item = new Shoes(name, quantity);

        }

        return item;

    }


}
