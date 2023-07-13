package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //initialising new objects
//        Animal a1 = new Animal();
//        Animal a2 = new Animal();
//        //setting some of their values
//        a1.setWeight(200);
//        a2.setLifeExpectancy(15);
//
//        //checking that they work
//        System.out.println("Weight: " + a1.getWeight());
//        System.out.println("Life Expectancy: " + a2.getLifeExpectancy());

        //Creating a new animal using the constructor with all attribute variables
//        Animal a3 = new Animal();
        //Testing that it works with print statements
//        System.out.println("Species:" + a3.getSpecies());
//        System.out.println("Noise: " + a3.getNoise());
//        System.out.println("Land Animal?: " + a3.isLandAnimal());

        //Creating another new animal using the full constructor
//        Animal a4 = new Animal("whale","click",2000F,50,false);
        //Testing again
//        System.out.println("\nSpecies:" + a4.getSpecies());
//        System.out.println("Noise: " + a4.getNoise());
//        System.out.println("Land Animal?: " + a4.isLandAnimal());

//        Animal a5 = new Animal("tiger","meow");
        //Testing that it works with print statements
//        System.out.println("\nSpecies:" + a5.getSpecies());
//        System.out.println("Noise: " + a5.getNoise());
//        System.out.println("Land Animal?: " + a5.isLandAnimal());

//        System.out.println(a3);
//        System.out.println(a4);
//        System.out.println(a5);
//        System.out.println("All animals are from planet: " + Animal.getPlanet());
//
//        System.out.println(a3.getSpecies() + " and " + a4.getSpecies() + " the same?: " + Animal.sameAnimal(a3,a4));
//        System.out.println(a5.getSpecies() + " and " + a5.getSpecies() + " the same?: " + Animal.sameAnimal(a5,a5));

        //initialising animals array
        //Animal[] animals = {a3,a4,a5};

        //for loop iterating over the array and printing
//        for(int i=0;i<animals.length;i++){
//            System.out.println(animals[i]);
//        }
//
//        //foreach loop iterating over the array and printing
//        for (Animal animal:animals) {
//            System.out.println(animal);
//        }

//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<animals.length;i++){
//            String x = animals[i].getSpecies();
//            sb.append(x + " ");
//        }
//        System.out.println(sb);

        //initialise Dog object and print life expectancy
//        Dog d1 = new Dog(50,15,"Bob","Mabs",4);
//        Dog d2 = new Dog();
//        System.out.println(d1.getLifeExpectancy());
//        System.out.println(d2.getName());

        //Array of Animals/Dogs created
//        Animal[] animals =  { new Dog(), new Dog(50,15,"Bob","Mabs",4)
//        };
//        //foreach loop, printing the life expectancy of the animals in the array
//        for (Animal animal: animals) {
//            System.out.println("Life Expectancy: " + animal.getLifeExpectancy());
//        }

//        Dog d1 = new Dog();
//        System.out.println(d1.makeNoise());

//        //array of type Animal containing Dog objects
//        Animal[] animals =  { new Dog(), new Dog(50,15,"Bob","Mabs",4)
//        };
//
//        //looping through array and invoking the abstract method
//        for (Animal animal: animals) {
//            System.out.println(animal.makeNoise());
//        }
//
//        // array of object implementing the same interface
//        Buyable[] purchases = { new Dog(), new Laptop(100.00)};
//        // looping through interface array and invoking overriden methods
//        for (Buyable purchase: purchases) {
//            System.out.println(purchase.buy(2));
//        }
//        Dog dog1 = new Dog(50,200,"sprinkles","Mabs",4);
//        Dog d1 = new Dog(50,1,"Bob","Mabs",4);
//        Dog d2 = new Dog();
//        List<Dog> dogsList = new ArrayList<>();
//        dogsList.add(dog1);
//        dogsList.add(d1);
//        dogsList.add(d2);
//        System.out.println("before sort:");
//        System.out.println(dogsList);
//        Collections.sort(dogsList);
//        System.out.println("After sort");
//        System.out.println(dogsList.toString());
//
//        Map<Integer, Dog> dogMap = new TreeMap<>();
//        for (int i = 0; i < dogsList.size(); i++){
//            dogMap.put(i, dogsList.get(i));
//        }
//        Set<Map.Entry<Integer,Dog>> set = dogMap.entrySet();
//
//        for (Map.Entry<Integer,Dog> dog:
//             set) {
//            System.out.println("the key is: " + dog.getKey() + " and the value is: " + dog.getValue());
//        }
//
//        System.out.println(dogMap);

        Date date = new Date();
        System.out.println("Todays date: " + date);

        
    }
}

