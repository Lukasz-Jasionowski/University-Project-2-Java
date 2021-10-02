package com.company;

public class Main {

    public static void main(String[] args) {
        Integer x = 3;
        Animal dog = new Animal("Canis");
        Animal cat = new Animal("Felis");
        dog.name = "Szarik";
        dog.weight = 12.3;
        dog.age = 4;

        System.out.println(dog.name);

        cat.name = "Kitty";
        System.out.println("Czy kot żyje? " + cat.alive);
        System.out.println("Waga kota: " + cat.weight);

        cat.introduceYourself();
        dog.introduceYourself();

        cat.doYouLike("mouse");
        dog.doYouLike("slippers");

        Integer humanAge = dog.getHumanAge();
        System.out.println("If I'll be human I'll be " + humanAge + " years old");

        Human me = new Human();
        me.firstName = "Łukasz";
        me.lastName = "Jasionowski";
        me.pet = dog;
        me.getMyCar();
        me.getMyCar();

        System.out.println("I have a " + me.pet.species);
        System.out.println("I called it " + me.pet.name);

        Car myCar = new Car();
        myCar.producer = "Audi";
        myCar.model = "A4";
        myCar.howManyDoors = 4;
        myCar.yearOfProduce = 2020;
        myCar.value = 60000.00;

        System.out.println("I have a car, which is " + myCar.producer + " " + myCar.model + " the car has " + myCar.howManyDoors + " doors and has been created in " + myCar.yearOfProduce);

        cat.feed();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.feed();
        cat.feed();
        cat.takeForAWalk();

// Zadanie 3 i 4
        me.setSalary(6000.50);
        me.getSalary();
// Zadanie 5 //Błąd bo pokazuje, else
        me.setSalary(60000.50);
        me.setMyCar(myCar);

    }
}
