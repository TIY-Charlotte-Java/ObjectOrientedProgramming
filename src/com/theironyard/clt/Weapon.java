package com.theironyard.clt;

/**
 * Created by stephenwilliamson on 12/8/16.
 */
public class Weapon extends InventoryItem {

        public Weapon(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
            this.category = "Weapon";
        }
}
