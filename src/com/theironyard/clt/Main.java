package com.theironyard.clt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        // write your code here

        ArrayList<InventoryItem> item = new ArrayList<>();
       // InventoryItem product = new InventoryItem();
        item.add(createItem("emi", 3, "book"));


    }

    /*public static void Scanner(){
        Scanner scanner = new Scanner(System.in);
    }*/

    public static InventoryItem createItem (String name, int quantity, String category) throws Exception{
        // create a static method -- createItem
        //returns an object using category class -- if you find the category then return that infromation which is in
        // there -- Book then return name,quantity and category else throws and error
        //Scanner scanner = new Scanner(System.in);

        switch (category) {
            case "Book":
                System.out.printf("the category is %s, the quantity %d, the name is %s ", name , quantity,category);
                return new Book(name,quantity,category);
                //pritn book info
                break;
            case "Toy":
                return new Toy(name,quantity,category);
                //print toy info
                break;
            case "Dress":
                //print dress info
                break;
            case "Shoes":
                //print shoes info
                break;
            case "Pant":
                //print pant info
                break;

            default:
                System.out.println("you have entered an invalid category");
                throw new Exception("incorrect information");
                //  System.out.println(createItem("book", 2, "book"));
        }

        //return createItem("flower",1,"toy");
        //return createItem("emi", 1, "book");
    return;
}
