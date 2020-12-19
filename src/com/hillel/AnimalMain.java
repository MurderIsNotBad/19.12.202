package com.hillel;

import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Animal";
        animal.print();

        Cat cat = new Cat();
        cat.name = "Vasya";
        cat.print();

        Dog dog = new Dog();
        dog.name = "Bob";
        dog.print();

        Parrot parrot= new Parrot();
        parrot.name = "Kold";
        parrot.print();

        Animal parrot2 = new Parrot();
        parrot2.name = "Kesha2";

        List<Animal> animals = List.of(cat, dog, parrot, parrot2, animal);

        for(Animal an: animals){
            an.print();
            an.say();
            if (an instanceof Cat){
                Cat catAnimal = (Cat) an;
                cat.mur();
            }
        }

    }
}
