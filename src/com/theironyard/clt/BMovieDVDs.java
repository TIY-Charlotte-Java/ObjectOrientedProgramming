package com.theironyard.clt;

/**
 * Created by graceconnelly on 12/7/16.
 */
public class BMovieDVDs {

        String filmTitle;
        int qty;
        String category;

    public BMovieDVDs(String filmTitle, int qty, String category) {
        this.filmTitle = filmTitle;
        this.qty = qty;
        this.category = category;
    }

    public void getInfo(){
        System.out.printf("Film Title: %s\nQuantity: %d\nGenre: %s\n\n",this.filmTitle,this.qty,this.category);
    }

}
