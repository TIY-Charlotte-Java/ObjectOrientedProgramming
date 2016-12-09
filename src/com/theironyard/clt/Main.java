package com.theironyard.clt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        // write your code here

        ArrayList<InventoryItem> item = new ArrayList<>();
        item.add(createItem("emi", 1, "Book"));
        item.add(createItem("train", 1, "Toy"));
        item.add(createItem("megan", 1, "Dress"));
        item.add(createItem("Skinny Pants", 1, "Pant"));
        item.add(createItem("high heels", 1, "Shoes"));


        for (int i = 0; i < item.size(); i++) {
            item.get(i).display();
        }
    }


    public static InventoryItem createItem(String name, int quantity, String category) throws Exception {

        switch (category) {
            case "Book":
                return new Book(name, quantity);
            case "Toy":
                return new Toy(name, quantity);
            case "Dress":
                return new Dress(name, quantity);
            case "Shoes":
                return new Shoes(name, quantity);
            //print shoes info
            case "Pant":
                return new Pant(name, quantity);
            //print pant info
            default:
                throw new Exception("incorrect information");
        }

    }

}





