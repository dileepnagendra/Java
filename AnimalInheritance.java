package com.dileep;

import java.util.Scanner;

class Animal {
    String name;
    int age;
    String sound;

    Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    void makeSound() {
        System.out.println("Animal Sound: " + sound);
    }
}

class Dog extends Animal {
    String breed;
    boolean isTrained;

    Dog(String name, int age, String sound, String breed, boolean isTrained) {
        super(name, age, sound);
        this.breed = breed;
        this.isTrained = isTrained;
    }

    void displayInfo() {
        System.out.printf("Dog Information:%nName: %s%nAge: %d%nSound: %s%nBreed: %s%nTrained: %b%n",
                name, age, sound, breed, isTrained);
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Animal class
        Animal animal = new Animal(scanner.next(), scanner.nextInt(), scanner.next());

        // Input for Dog class
        Dog dog = new Dog(scanner.next(), scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextBoolean());

        // Output
        animal.makeSound();
        dog.displayInfo();

        scanner.close();
    }
}
