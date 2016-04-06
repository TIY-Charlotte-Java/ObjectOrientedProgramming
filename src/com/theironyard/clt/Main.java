package com.theironyard.clt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    static List<String> inventory = new ArrayList<>();

    public static void main(String[] args) {
    	// write your code here
    }
    static int createItem() {
        int relay = 0;
        Scanner scanner = new Scanner(System.in);
        String category = scanner.nextLine();
        //search for item by category
        if (category.equals(inventory)) {
            inventory.add(scanner.nextLine());
        }
        //create Item for that category

        //create exception if category is not found
        
        //return item
        return(relay);
    }
}
