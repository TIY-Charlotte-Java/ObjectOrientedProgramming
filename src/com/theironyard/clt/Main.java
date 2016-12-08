package com.theironyard.clt;

import jdk.nashorn.internal.objects.annotations.Function;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<InventoryItem> list = new ArrayList<>();

        list.add(createItem("AppleWatch", 2, "Watch"));
        list.add(createItem("Chocolate", 3, "IceCream"));
        list.add(createItem("Hershey", 5, "CandyBar"));
        list.add(createItem("iPhone7", 1, "Phone"));
        list.add(createItem("Folgers", 4, "Coffee"));

        System.out.print (list.get(0).toString());
        System.out.print (list.get(1).toString());
        System.out.print (list.get(2).toString());
        System.out.print (list.get(3).toString());
        System.out.print (list.get(4).toString());

    }

    static InventoryItem createItem (String name, int quantity, String category) throws Exception {
        switch (category.toUpperCase()) {
            case "CANDYBAR":
                System.out.printf("\nThere are %d %s bars in inventory", quantity, name);
                return new InventoryItem(name, quantity, category);
            case "WATCH":
                System.out.printf("\nThere are %d %s watches in inventory", quantity, name);
                return new InventoryItem(name, quantity, category);
            case "PHONE":
                System.out.printf("\nThere are %d %s phones in inventory", quantity, name);
                return new InventoryItem(name, quantity, category);
            case "ICECREAM":
                System.out.printf("\nThere are %d %s ice cream flavors in inventory", quantity, name);
                return new InventoryItem(name, quantity, category);
            case "COFFEE":
                System.out.printf("\nThere are %d %s coffee brands in inventory", quantity, name);
                return new InventoryItem(name, quantity, category);
            default:
                throw new Exception("\nError: Not a category");
        }
    }
}

