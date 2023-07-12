package org.example;

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
        Animal a3 = new Animal();
        //Testing that it works with print statements
//        System.out.println("Species:" + a3.getSpecies());
//        System.out.println("Noise: " + a3.getNoise());
//        System.out.println("Land Animal?: " + a3.isLandAnimal());

        //Creating another new animal using the full constructor
        Animal a4 = new Animal("whale","click",2000F,50,false);
        //Testing again
//        System.out.println("\nSpecies:" + a4.getSpecies());
//        System.out.println("Noise: " + a4.getNoise());
//        System.out.println("Land Animal?: " + a4.isLandAnimal());

        Animal a5 = new Animal("tiger","meow");
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
        Animal[] animals =  { new Animal(), new Dog(), new Dog(50,15,"Bob","Mabs",4)
        };
        //foreach loop, printing the life expectancy of the animals in the array
        for (Animal animal: animals) {
            System.out.println("Life Expectancy: " + animal.getLifeExpectancy());
        }
    }
}

