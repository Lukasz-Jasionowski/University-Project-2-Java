package com.company;

import devices.Car;
import devices.Device;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Canis");
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

        Human me = new Human();
        me.firstName = "Łukasz";
        me.lastName = "Jasionowski";
        me.age = 26;
        me.pet = dog;

        //Zadanie 1
        cat.feed();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.feed();
        cat.feed();
        cat.takeForAWalk();

        //Zadanie 2
        me.getMyCar();
        Car myCar = new Car("Audi", "A4", 4, 2020, 60000.00);
        System.out.println("Mam samochód, " + myCar.producer + " " + myCar.model + " które jest " + myCar.howManyDoors + " drzwiowe i zostało wyprodukowane w " + myCar.yearOfProduction + " roku");

        //Zadanie 3 & 4
        me.setSalary(6000.50);
        me.getSalary();

        //Zadanie 5
        me.setSalary(60000.50);
        me.setMyCar(myCar);

        //Zadanie 6
        Car myCar2 = new Car("Audi", "A4", 4, 2020, 60000.00);
        Car myCar3 = myCar;
        System.out.println(myCar.equals(myCar2));
        System.out.println(myCar.equals(myCar3));
        System.out.println(myCar);
        System.out.println(myCar2);
        System.out.println(myCar3);
        System.out.println(me);
        System.out.println(cat);

        System.out.println(me.species);
        me.doYouLike("mięsko");

        //Zadanie 7
        //  Device washingMachine = new Device("Bosch","Speed600",2021);
        Phone myPhone = new Phone("Samsung", "A50", 2019, 1200.0);
        System.out.println(myPhone);
        myPhone.turnOn();
        System.out.println(myCar);
        myCar.turnOn();

        //Zadanie 8
        Human brother = new Human();
        brother.cash = 3000.0;
        me.cash = 1000.0;
        dog.sale(me,brother,2000.0);
    }
}