package com.company;

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
        Car myCar = new Car();
        myCar.producer = "Audi";
        myCar.model = "A4";
        myCar.howManyDoors = 4;
        myCar.yearOfProduce = 2020;
        myCar.value = 60000.00;
        System.out.println("Mam samochód, " + myCar.producer + " " + myCar.model + " które jest " + myCar.howManyDoors + " drzwiowe i zostało wyprodukowane w " + myCar.yearOfProduce + " roku");

        //Zadanie 3 & 4
        me.setSalary(6000.50);
        me.getSalary();

        //Zadanie 5
        me.setSalary(60000.50);
        me.setMyCar(myCar);

        //Zadanie 6

    }
}
