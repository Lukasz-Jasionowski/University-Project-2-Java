package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
     /*   Animal dog = new Animal("Canis");
        Animal cat = new Animal("Felis");
        dog.name = "Szarik";
        dog.age = 4;
        System.out.println(dog.name);
        cat.name = "Kitty";
        cat.introduceYourself();
        dog.introduceYourself();
        cat.doYouLike("mouse");
        dog.doYouLike("slippers");
        Integer humanAge = dog.getHumanAge();
        System.out.println("Jeśli byłbym człowiekiem miałbym " + humanAge + " lat");
*/
        Human me = new Human();
        me.firstName = "Łukasz";
        me.lastName = "Jasionowski";
        me.age = 26;
        // me.pet = dog;

        //Zadanie 1 ↓
    /*  cat.feed();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.feed();
        cat.feed();
        cat.takeForAWalk();
    */
        //Zadanie 2 ↓
        me.getMyCar(0);
        Car myCar = new Car("Audi", "A4", 4, 2020, 60000.00) {
            @Override
            public void refuel() {
            }
        };
        System.out.println("Mam samochód, " + myCar.producer + " " + myCar.model + " które jest " + myCar.howManyDoors + " drzwiowe i zostało wyprodukowane w " + myCar.yearOfProduction + " roku");

        //Zadanie 3 & 4 ↓
        me.setSalary(6000.50);
        me.getSalary();

        //Zadanie 5 ↓
        me.setSalary(60000.50);
        me.setMyCar(myCar, 0);

        //Zadanie 6 ↓
        Car myCar2 = new Car("Audi", "A4", 4, 2020, 60000.00) {
            @Override
            public void refuel() {
            }
        };
        Car myCar3 = myCar;
        System.out.println(myCar.equals(myCar2));
        System.out.println(myCar.equals(myCar3));
        System.out.println(myCar);
        System.out.println(myCar2);
        System.out.println(myCar3);
        System.out.println(me);
        // System.out.println(cat);

        System.out.println(me.species);
        me.doYouLike("mięsko");

        //Zadanie 7 ↓
        //  Device washingMachine = new Device("Bosch","Speed600",2021);
        Phone myPhone = new Phone("Samsung", "A50", 2019, 1200.0);
        System.out.println(myPhone);
        myPhone.turnOn();
        System.out.println(myCar);
        myCar.turnOn();

        //Zadanie 8 ↓
        Human brother = new Human();
        brother.firstName = "Mati";
        brother.name = "Mati";
        brother.cash = 10000.0;
        me.cash = 1000.0;
        me.hasCar(myCar);

        //   dog.sale(me, brother, 2000.0);
        //   myCar.sale(me, brother, 6000.0);

        me.phone = myPhone;
        myPhone.sale(me, brother, 10000.0);

        Animal human = new Human();
        //  Animal humanHomoSapiens = new Animal("homo sapiens");
        me.pet = human;
        //   me.pet = humanHomoSapiens;
        human.sale(me, brother, 5000.0);
        //    humanHomoSapiens.sale(me,brother,5000.0);
        //Zadanie 9 ↓
        me.pet.feed(0.2);
        me.pet.feed();
        Pet kitty = new Pet("Alley Cat", "Kitty", 2, true);
        kitty.feed(0.5);
        kitty.feed();
        FarmAnimal cow = new FarmAnimal("cattle");
        cow.feed(0.1);
        cow.feed();
        cow.beEaten();
        myPhone.instalAnApp("GhostBuster");
        myPhone.instalAnApp("GhostBuster", "1.0");
        myPhone.instalAnApp("GhostBuster", "1.0", "Darkweb");
        Electric eCar = new Electric("Audi", "A3", 4, 2010, 40000.00);
        Disel dCar = new Disel("Audi", "A4", 2, 2020, 50000.00);
        LPG lpgCar = new LPG("Audi", "A5", 4, 2022, 80000.00);
        eCar.refuel();
        dCar.refuel();
        lpgCar.refuel();
        me.addCar(eCar);
        me.addCar(dCar);
        me.addCar(lpgCar);
        me.addCar(myCar);
        me.addCar(myCar3);
        System.out.println(me.totalValueOfCars());
        me.removeCar(myCar3);

        Car lambo = new Car("Lamborghini", "Szybki", 2, 2022, 3000000.00) {
            @Override
            public void refuel() {
                System.out.println("Zalej najdroższe paliwo");
            }
        };
        brother.cash = 60000.0;
        me.addCar(lambo);
        lambo.carOwners.add("Łukasz");
        lambo.sale(me, brother, 50000.00);
        System.out.println("Lista właścicieli: " + lambo.carOwners);
        System.out.println(lambo.carOwners.size());
        lambo.wasAnOwner();
        lambo.isHeSoldHim(me, brother);
        lambo.howManyTimesSold();
        Application puzzleGarden = new Application("Puzzle Garden", 1.0, 0.0);
        Application heroes = new Application("Heroes III", 3.0, 30.0);
        Application vip = new Application("Bogol 6000", 1.0,300000.0);
        myPhone.isInstalled(puzzleGarden);
        myPhone.installNewApp(puzzleGarden,me);
        myPhone.installNewApp(heroes,me);
        myPhone.isInstalled(heroes);
        myPhone.isInstalled("Heroes III");
        myPhone.installNewApp(vip,me);
        myPhone.allFreeApps();
        myPhone.howManyAppsIsInstalled();
        myPhone.sortNameApps();
        myPhone.sortViaPrice();
        System.out.println(myPhone.appsCollection);
    }
}