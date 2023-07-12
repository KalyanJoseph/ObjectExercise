package org.example;

// new class unrelated to Animal but using the same interface
public class Laptop implements Buyable{

    private double price;
    public Laptop(double price) {
        this.price = price;
    }

    // overriden method from the interface
    @Override
    public String buy(int amount) {
        return "You bought " + amount + " laptops.";
    }
}
