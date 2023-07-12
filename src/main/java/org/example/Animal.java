package org.example;

public class Animal {
    //attributes
    private String species;
    private String noise;
    private float weight;
    protected int lifeExpectancy;
    private boolean isLandAnimal;
    private static String planet;

    static {
        planet = "Earth";
    }

    //Constructors
    //Default Constructor (chained to species and noise constructor)
    public Animal() {
        this("lion","roar");
    }

    //Constructor using just species and noise (chained to full)
    public Animal(String species, String noise) {
        this(species,noise,200,15,true);
    }

    //Full Constructor with all attributes as parameters
    public Animal(String species, String noise, float weight, int lifeExpectancy, boolean isLandAnimal) {
        this.species = species;
        this.noise = noise;
        this.weight = weight;
        this.lifeExpectancy = lifeExpectancy;
        this.isLandAnimal = isLandAnimal;
    }

    //Methods
    @Override
    public String toString() {
        return "This is an animal of species: " + this.getSpecies();
    }

    //Getters and Setters
    public String getSpecies() {
        return species;
    }

    public String getNoise() {
        return noise;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }
    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public boolean isLandAnimal() {
        return isLandAnimal;
    }

    public static String getPlanet() {
        return planet;
    }

    //static method that compares animals using .equals()
    public static boolean sameAnimal(Animal a1, Animal a2) {
        return a1.equals(a2);
    }
}

