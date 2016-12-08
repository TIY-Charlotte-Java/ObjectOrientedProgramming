package com.theironyard.clt;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by emileenmarianayagam on 12/7/16.
 */
public class InventoryItem {


    String name;
    int quantity;
    String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


public static void info(InventoryItem item){
    Scanner scanner = new Scanner(System.in);
    System.out.println("what is the name of you item");
    item.setName(scanner.nextLine());
    System.out.println("How many do you have : ");
    item.setQuantity(scanner.nextInt());
    System.out.println(item.getName());
    System.out.println(item.getQuantity());
    System.out.println(item.getCategory());
}



}
