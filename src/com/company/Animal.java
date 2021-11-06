package com.company;

public class Animal implements Saleable{
    final String species; //Zadanie 1
    String name;
    private Double weight; //Zadanie 1
    Integer age;
    Boolean alive;

    //Zadanie 1
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

    //Zadanie 1
    void feed() {
        if (!alive && weight <= 0) {
            System.out.println("Zwierzę jest martwe. Nie może zostać nakarmione");
        } else {
            this.weight += 1;
            System.out.println("Zwierzę zostało wyprowadzone na spacer");
            System.out.println("Aktualna waga zwierzęcia " + this.weight + " kg");
        }
    }

    //Zadanie 1
    void takeForAWalk() {
        if (this.weight <= 0) {
            alive = false;
            System.out.println("Zwierzę jest martwe nie może zostać wyprowadzone na spacer");
        } else if (this.weight < 0) {
            this.weight = 0.0;
            System.out.println("Waga zwierzęcia została zredukowana do " + this.weight + " kg");
        } else {
            this.weight -= 1;
            if (this.weight < 0.0) {
                this.weight = 0.0;
            }
            System.out.println("Waga zwierzęcia została zredukowana do " + this.weight + " kg");
        }
    }

    void introduceYourself() {
        System.out.println("Jestem " + this.name);
    }

    void doYouLike(String foodType) {
        if (this.species == "Felis" && foodType == "mouse") {
            System.out.println("Tak, lubię " + foodType);
        } else {
            System.out.println("Nie, nie lubię");
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

    //Zadanie 6
    public String toString(){
        return species + " " + name + " " + weight + " " + age + " " + alive + " ";
    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("Kupujący ma za mało pieniędzy.");
        }
        else if(this instanceof Human) {
            System.out.println("Nie można sprzedawać ludzi!");
        }else if (seller.pet == null) {
            System.out.println("Sprzedający nie ma żadnego zwierzęcia.");
        } else if (!seller.pet.equals(this)) {
            System.out.println("Sprzedający nie ma tego modelu zwierzęcia.");
        } else {
            //wymiana kasy
            seller.cash += price;
            buyer.cash -= price;
            //wymiana zwierzęcia
            seller.pet = null;
            buyer.pet = this;
            System.out.println("Transakcja się udała, kupiono " + this);
        }
    }
}