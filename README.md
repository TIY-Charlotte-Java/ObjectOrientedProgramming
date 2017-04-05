[The Code for Today's TextAdventure](https://github.com/TIY-Charlotte-Java/TextAdventure)

[Fork The Repo](https://github.com/TIY-Charlotte-Java/ObjectOrientedProgramming).
# Object Oriented Programming
Let's talk Inheritance.  

But first, enjoy this gif of someone thinking they're being attacked by bees.
  
![bees]

Now for your assignment.

# Object-Oriented Programming

## Description

The goal of this assignment is to create an Inventory system.

Use inheritance in this assignment. To do so, create at least five different classes for product categories. Each one should set a different value for the "category" field.

## Requirements

* Add an ArrayList that tracks all items of type `InventoryItem`, called "inventory."
* Create at least five classes that extend the `InventoryItem` class, each one representing a product category. 
* Each category class should have a constructor that sets the "category" field to the appropriate name.
* Add one instance of each class to the "inventory" ArrayList
* List each Inventory Item in the `inventory` Array List.
  * For each item, display the category
* Use `String.format` or `System.out.printf` anywhere you are manually concatenating strings with `+`.


## Example

```java
// parent class

public class InventoryItem {
    String name;
    int quantity;
    String category;
}

// subclasses

public class Shoe extends InventoryItem {
    public Shoe(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "Shoe";
    }
}

public class Shirt extends InventoryItem {
    public Shirt(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "Shirt";
    }
}
```


[bees]: http://i.imgur.com/yoja1wd.gif
