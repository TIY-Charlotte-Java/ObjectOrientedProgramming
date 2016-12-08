package com.theironyard.clt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        // write your code here

        ArrayList<InventoryItem> item = new ArrayList<>();
        item.add(createItem("emi", 1, "book"));
        item.add(createItem("train", 1, "toy"));
        item.add(createItem("megan", 1, "Dress"));
        item.add(createItem("Skinny Pants", 1, "Pant"));
        item.add(createItem("high heels", 1, "Shoes"));


    }

    public static InventoryItem createItem(String name, int quantity, String category) throws Exception {
        // create a static method -- createItem
        //returns an object using category class -- if you find the category then return that infromation which is in
        // there -- Book then return name,quantity and category else throws and error
        Scanner scanner = new Scanner(System.in);

        System.out.print("please enter your category -- Book, Toy, Dress ,Shoes ,Pant,\n");
        category = scanner.nextLine();

        switch (category) {
            case "Book":
                System.out.printf("the category is %s, the quantity %d, the name is %s ", name, quantity, category);
                return new Book(name, quantity, category);
            //pritn book info
            case "Toy":
                return new Toy(name, quantity, category);
            //print toy info
            case "Dress":
                return new Dress(name, quantity, category);
            //print dress info
            case "Shoes":
                return new Shoes(name, quantity, category);
            //print shoes info
            case "Pant":
                return new Pant(name, quantity, category);
            //print pant info
            default:
                System.out.println("you have entered an invalid category");
                throw new Exception("incorrect information");
                //  System.out.println(createItem("book", 2, "book"));
        }

    }
}