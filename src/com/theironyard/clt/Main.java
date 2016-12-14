package com.theironyard.clt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Potion p1 = new Potion("heal", 2);
        Armor a1 = new Armor("plate", 1);
        Weapon w1 = new Weapon("sword", 1);
        Map m1 = new Map("village", 2);
        Wand wand1 = new Wand("wind", 2);

        ArrayList<InventoryItem> itemList = new ArrayList<>();

        itemList.add(p1);
        itemList.add(a1);
        itemList.add(w1);
        itemList.add(m1);
        itemList.add(wand1);

        System.out.println(p1.category);
    }

    public static InventoryItem createItem(String name, int quantity, String category) throws Exception {

        System.out.println("Would you like to create a(n)\n weapon\n wand\n map\n potion\n armor");

        Scanner scanner = new Scanner(System.in);

        category = scanner.nextLine();

        switch (category) {

            case "weapon":
                System.out.println("What is your weapon's name?");
                String wName = scanner.nextLine();
                System.out.println("How many do you have?");
                int wNum = scanner.nextInt();

                new Weapon(wName, wNum);

            case "wand":
                System.out.println("What is your wand's name?");
                String wandName = scanner.nextLine();
                System.out.println("How many do you have?");
                int wandNum = scanner.nextInt();

                new Wand(wandName, wandNum);

            case "map":
                System.out.println("What is your maps's name?");
                String mapName = scanner.nextLine();
                System.out.println("How many do you have?");
                int mapNum = scanner.nextInt();

                new Map(mapName, mapNum);

            case "potion":
                System.out.println("What is your potion's name?");
                String pName = scanner.nextLine();
                System.out.println("How many do you have?");
                int pNum = scanner.nextInt();

                new Potion(pName, pNum);

            case "armor":
                System.out.println("What is your armor's name?");
                String aName = scanner.nextLine();
                System.out.println("How many do you have?");
                int aNum = scanner.nextInt();

                new Armor(aName, aNum);

            default:
                System.out.println("The item type you entered is not recognized");
                throw new Exception("DOES NOT COMPUTE");
        }

    }
}

