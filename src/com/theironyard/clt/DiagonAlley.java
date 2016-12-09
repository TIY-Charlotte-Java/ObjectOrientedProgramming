package com.theironyard.clt;

/**
 * Created by kelseynewman on 12/7/16.
 */
public class DiagonAlley {
     String item;
     int quantity;
     String shopName;

    @Override
    public String toString() {
         System.out.printf("%s - %s \n", item, shopName);
         return item;
    }
}


