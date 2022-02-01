package com.company;

import creatures.Animal;
import devices.Car;
import devices.Phone;
import devices.Device;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Human extends Animal {
    private static final int DEFAULT_GAREGE_SIZE = 4;
    public String firstName;
    String lastName;
    Integer age;
    private Double salary; //Zadanie 3 & 4
    public Animal pet; //Zadanie 1
    public Car[] garage = new Car[4];
    public Double cash; //Zadanie 8
    public Phone phone;

    //Zadanie 3 & 4 ↓
    Human() {
        super("homo sapiens");
        this.salary = 1200.0;
        this.garage = new Car[DEFAULT_GAREGE_SIZE];
    }

    Human(Integer garageSize) {
        super("homo sapiens");
        this.salary = 1200.0;
        this.garage = new Car[garageSize];
    }


    void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego ");
            System.out.println("Proszę odebrać aneks do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmanie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = salary;
        } else if (salary < 0) {
            System.out.println("Błąd! Wynagordzenie nie może być ujemne!");
        }
    }

    Double getSalary() {
        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);
        System.out.println("Wynagrodzenie: " + this.salary);
        return this.salary;
    }

    //Zadanie 5 ↓
    void setMyCar(Car myCar, Integer parkingLotNumber) {
        if (salary > myCar.value) {
            System.out.println("Udało się kupić samochód za gotówkę");
            Scanner location = new Scanner(System.in);
            this.garage[parkingLotNumber] = myCar;
        } else if (salary > myCar.value / 12) {
            System.out.println("Udało się kupić samochód na kredyt!");
            Scanner location = new Scanner(System.in);
            this.garage[parkingLotNumber] = myCar;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }

    public Car getMyCar(Integer parkingLotNumber) {
        return this.garage[parkingLotNumber];
    }

    //Zadanie 6 ↓
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + salary + " " + pet + Arrays.toString(garage);

    }

    @Override //Zadanie 8 ↓
    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("Handel ludźmi jest nielegalny!!");
    }

    @Override //Zadanie 9 ↓
    public void feed() {
        System.out.println("Człowiek został nakarmiony");
    }

    @Override
    public void feed(Double foodWeight) {
        System.out.println("Człowiek został nakarmiony, a waga jedzenia wyniosła " + foodWeight + "kg");
    }

    public boolean hasCar(Car car) {
        try {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == car) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean hasFreeParkingLot() {
        try {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
                break;
            }
        }
    }

    public void addCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = car;
                break;
            }
        }
    }

    public double totalValueOfCars() {
        double value = 0;
        for (int i = 0; i < this.garage.length; i++) {
            value += getMyCar(i).value;
        }
        return value;
    }

    public void carSort() {
        //KOD
    }
}