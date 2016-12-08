package com.theironyard.clt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here

        ArrayList<InventoryItem> item = new ArrayList<>();
        InventoryItem product = new InventoryItem();

        product.setName("em");
        product.setQuantity(2);
        System.out.println(product.getName());

    }

    /*public static void Scanner(){
        Scanner scanner = new Scanner(System.in);
    }*/

    public static InventoryItem createItem(String name, int quantity, String category) {
        // create a static method -- createItem
        //returns an object using category class -- if you find the category then return that infromation which is in
        // there -- Book then return name,quantity and category else throws and error
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which category information would you like - 1. Book, 2. Toy, 3. Dress, 4. Shoes, 5. Pant");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                //pritn book info
                break;
            case 2:
                //print toy info
                break;
            case 3:
                //print dress info
                break;
            case 4:
                //print shoes info
                break;
            case 5:
                //print pant info
                break;

            default:
                System.out.println("you have entered an invalid category");
               // throw Exception;
                //  System.out.println(createItem("book", 2, "book"));
        }

        //return createItem("flower",1,"toy");
        return createItem("emi", 1, "book");
    }
}
