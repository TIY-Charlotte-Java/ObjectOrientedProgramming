package com.theironyard.clt;

/**
 * Created by stephenwilliamson on 12/8/16.
 */
public class Wand extends InventoryItem {

        public Wand(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
            this.category = "Wand";
        }
}
