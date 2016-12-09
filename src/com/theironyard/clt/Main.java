package com.theironyard.clt;

import java.util.ArrayList;

public class Main {
     private static ArrayList<DiagonAlley> items = new ArrayList<>();

     static DiagonAlley createItem(String item, int quantity, String shopName) throws Error {
        switch (shopName) {
            case "Gringotts":
                return new Gringotts(item, quantity);
            case "FlourishAndBlotts":
                return new FlourishAndBlotts(item, quantity);
            case "LeakyCauldron":
                return new LeakyCauldron(item, quantity);
            case "Ollivanders":
                return new Ollivanders(item, quantity);
            case "KnockturnAlley":
                return new KnockturnAlley(item, quantity);
            default:
                throw new Error("That's not a shop in Diagon Alley! Try again.");
        }
    }

    public static void main(String[] args) {

        items.add(createItem("knuts", 34, "Gringotts"));
        items.add(createItem("quills", 45, "FlourishAndBlotts"));
        items.add(createItem("butterbeer",12,"LeakyCauldron"));
        items.add(createItem("wands",156, "Ollivanders"));
        items.add(createItem("vanishing cabinet", 1 , "KnockturnAlley"));

        items.toString();
    }
  }


