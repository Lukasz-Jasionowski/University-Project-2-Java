package com.company;

public class Animal {
    String species;
    String name;
    Double weight;
    Integer age;
    Boolean alive;

    Animal(String species) {
        this.species = species;
        this.alive = true;

        if (this.species == "Canis") {
            this.weight = 12.0;
        } else if (this.species == "Felis") {
            this.weight = 2.5;
        } else {
            this.weight = 1.0;
        }
    }

    void introduceYourself() {
        System.out.println("I'm " + this.name);
    }

    void doYouLike(String foodType) {
        if (this.species == "Felis" && foodType == "mouse") {
            System.out.println("yes, I like " + foodType);
        } else {
            System.out.println("no you idiot");
        }
    }

    Integer getHumanAge() {
        if (this.species == "Canis") {
            return this.age * 7;
        } else if (this.species == "Felis") {
            return this.age * 10;
        } else {
            return this.age;
        }
    }

    void feed() {
        if (!alive && weight <= 0) {
            System.out.println("Animal is dead. You can't feed it");
        } else {
            this.weight += 1;
            System.out.println("Animal was taken for a walk");
            System.out.println("It's weight now equals " + this.weight);
        }
    }

    void takeForAWalk() {
        if (this.weight <= 0) {
            alive = false;
            System.out.println("Animal is dead you can't take it for a walk");
        } else if (this.weight < 0) {
            this.weight = 0.0;
            System.out.println("Animal's weight was reduced to " + this.weight);
        } else {
            this.weight -= 1;
            if (this.weight < 0.0) {
                this.weight = 0.0;
            }
            System.out.println("Animal's weight was reduced to " + this.weight);
        }
    }
}