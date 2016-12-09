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

    public InventoryItem(String name, int quantity, String category) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

    public void display() {
        System.out.printf("the category is %s, the quantity %d, the name is %s\n", name, quantity, category);
    }
}