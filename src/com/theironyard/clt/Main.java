package com.theironyard.clt;

import java.util.ArrayList;

public class Main {
     static ArrayList<DiagonAlley> items = new ArrayList<>();

     static DiagonAlley createItem(String item, int quantity, String shopName) throws Error {
        switch (shopName) {
            case "Gringotts":
                return new Gringotts(item, quantity, shopName);
            case "FlourishAndBlotts":
                return new FlourishAndBlotts(item,quantity,shopName);
            case "LeakyCauldron":
                return new LeakyCauldron(item,quantity,shopName);
            case "Ollivanders":
                return new Ollivanders(item,quantity,shopName);
            case "KnockturnAlley":
                return new KnockturnAlley(item,quantity,shopName);
            default:
                throw new Error("%s is not a shop in Diagon Alley! Try again.");
        }
    }

    public static void main(String[] args) {

        items.add(createItem("knuts", 34, "Gringotts"));
        items.add(createItem("quills", 45, "FlourishAndBlotts"));
        items.add(createItem("butterbeer",12,"LeakyCauldron"));
        items.add(createItem("wands",156, "Ollivanders"));
        items.add(createItem("vanishing cabinet", 1 , "KnockturnAlley"));

    }

  }


