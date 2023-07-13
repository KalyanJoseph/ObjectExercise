package org.example;

public class Dog extends Animal implements Buyable, Comparable<Dog>{
    //attributes
    private String name;
    private String owner;
    private int visitsToVet;

    //Constructors

    //Default constructor
    public Dog() {
        this(40,15,"No Name","No Name",1);
    }

    //Constructor for Dog class, supers to the animal class with some dog specific values
    public Dog(float weight, int lifeExpectancy, String name, String owner, int visitsToVet){
        super("dog","bark",weight,lifeExpectancy,true);
        this.name = name;
        this.owner = owner;
        this.visitsToVet = visitsToVet;
    }

    //Methods

    //Overrides the getLifeExpectancy method to add on a year for each vet visit
    public int getLifeExpectancy() {
        return lifeExpectancy + this.visitsToVet;
    }

    //Overidden method in Dog class
    public String makeNoise() {
        return "The Dog goes woof";
    }

    // overriden method from the interface
    public String buy(int amount) {
        return "You bought " + amount + " dogs.";
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getVisitsToVet() {
        return visitsToVet;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", visitsToVet=" + visitsToVet +
                ", lifeExpectancy=" + lifeExpectancy +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        //return this.lifeExpectancy - o.lifeExpectancy;
        return this.getName().compareTo(o.getName());
    }
}
