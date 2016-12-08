package com.theironyard.clt;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<InventoryItem> list = new ArrayList<>();

        list.add(createItem("Tom's", 2, "shoe1"));
        list.add(createItem("NC State", 1, "shirt1"));
        list.add(createItem("Duke", 1, "hat1"));
        list.add(createItem("Skinny Jeans", 1, "pants1"));
        list.add(createItem("Timing", 1, "shoe1"));

    for (int i = 0; i < list.size(); i++) {
        list.get(i).showList();
        }
    }

    //Create a static createItem method in your main class which returns an object using the
    //correct category class (or throws and error for an invalid category name).
    //Switch statement - make it return something or use break;
    static InventoryItem createItem(String name, int quantity, String category) throws Exception {
        switch (category) {
            case "shoe1":
                return new Shoe(name, quantity);
            case "shirt1":
                return new Shirt(name, quantity);
            case "hat1":
                return new Hat(name, quantity);
            case "pants1":
                return new Pants(name, quantity);
            case "belt1":
                return new Belt(name, quantity);
            default:
                throw new Exception ("exception unrecognized category");
        }
    }
}
