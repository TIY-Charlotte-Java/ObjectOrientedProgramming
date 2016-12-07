package com.theironyard.clt;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        Inventory item = new Inventory();
        item.list.add(createItem("AppleWatch", 2, "Watch"));
        item.list.add(createItem("Chocolate", 3, "IceCream"));
        item.list.add(createItem("Hershey", 5, "CandyBar"));
        item.list.add(createItem("iPhone7", 1, "Phone"));
        item.list.add(createItem("Folgers", 4, "Coffee"));
        item.list.add(createItem("Addidas", 40, "Shoes"));
    }

    public static class Inventory {
        ArrayList<InventoryItem> list = new ArrayList<>();
    }

    static InventoryItem createItem (String name, int quantity, String category) throws Exception {
        switch (category.toUpperCase()) {
            case "CANDYBAR":
                System.out.printf("\nThere are %d %s bars in inventory", quantity, name);
                return new CandyBar(name, quantity, category);
            case "WATCH":
                System.out.printf("\nThere are %d %s watches in inventory", quantity, name);
                return new Watch(name, quantity, category);
            case "PHONE":
                System.out.printf("\nThere are %d %s phones in inventory", quantity, name);
                return new Phone(name, quantity, category);
            case "ICECREAM":
                System.out.printf("\nThere are %d %s ice cream flavors in inventory", quantity, name);
                return new IceCream(name, quantity, category);
            case "COFFEE":
                System.out.printf("\nThere are %d %s coffee brands in inventory", quantity, name);
                return new Coffee(name, quantity, category);
            default:
                throw new Exception("\nError: Not a category");
        }
    }
}

