package org.example;

public class Dog extends Animal{
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
}
