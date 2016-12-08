package com.theironyard.clt;

import java.util.ArrayList;

public class Main {

    public static ArrayList<BMovieDVDs> dvds = new ArrayList<>();

    //Creates item in DVD array indexed by Category
    public static BMovieDVDs createItem(String filmName, int qty, String category) throws Error{
        switch (category) {
            case "RomZomCom":
                return new RomZomCom(filmName, qty);
            case "SciFi":
                return new SciFi(filmName, qty);
            case "Action":
                return new Action(filmName, qty);
            case "Horror":
                return new Horror(filmName, qty);
            case "Instructional":
                return new Instructional(filmName, qty);
            default:
                throw new Error("This is an invalid category.");
        }
    }
    public static void main(String[] args) {
        //Create  in array
        dvds.add(createItem("DieHard", 5, "Action"));
        dvds.add(createItem("Death Wish 3", 3,"Action"));
        dvds.add(createItem("Samurai Cop", 1,"Action" ));
        dvds.add(createItem("Shaun of the Dead",28,"RomZomCom"));
        dvds.add(createItem("Night of the Living Deb",5, "RomZomCom"));
        dvds.add(createItem("Plan 9 from Outer Space", 3, "SciFi"));
        dvds.add(createItem("Devil Girl from Mars", 7,"SciFi"));
        dvds.add(createItem("Sharknado",9,"Horror"));
        dvds.add(createItem("Tree Stand Safety", 8,"Instructional"));
        dvds.add(createItem("Welcome to the Internet",3,"Instructional"));
        dvds.add(createItem("Birdemic", 34,"Horror"));
        dvds.add(createItem("Hard Ticket to Hawaii", 63,"Action"));
        dvds.add(createItem("Crazy Fat Ethel",3,"Horror"));

        for (int i = 0; i < dvds.size(); i++) {
            dvds.get(i).getInfo();
        }
    }
}
