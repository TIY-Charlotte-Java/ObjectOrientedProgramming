package com.theironyard.clt;

import java.util.ArrayList;

public class Main {

    public static ArrayList<InventoryItem> products = new ArrayList<>();

    public static void main(String[] args) throws Exception{

        products.add(createItem("Nike" , 12 , "Shoe"));
        products.add(createItem("T-Shirt" , 39 , "Shirt"));
        products.add(createItem("Levi's" , 8 , "Pants"));
        products.add(createItem("Fishing Hat" , 1 , "Hat"));
        products.add(createItem("Maui Jim" , 2 , "Glasses"));
        products.add(createItem("Galaxy Note 5" , 1 , "Phone"));
    }

    static InventoryItem createItem (String name, int quantity, String category) throws Exception{
        switch(category.toUpperCase()) {
            case "SHOE":
                System.out.printf("Added %d of %s to %s\n" , quantity , name, category);
                return new Shoe(name, quantity, category);

            case "SHIRT" :
                System.out.printf("Added %d of %s to %s\n" ,  quantity, name, category);
                return new Shirt(name, quantity, category);

            case "PANTS" :
                System.out.printf("Added %d of %s to %s\n" ,  quantity, name, category);
                return new Pants(name, quantity, category);

            case "HAT" :
                System.out.printf("Added %d of %s to %s\n" ,  quantity, name, category);
                return new Hat(name, quantity, category);

            case "GLASSES" :
                System.out.printf("Added %d of %s to %s\n" ,  quantity, name, category);
                return new Glasses(name, quantity, category);

            default :
                throw new Exception("Not a valid category\n");
        }

    }
}
