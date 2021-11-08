package com.company;

import devices.Car;
import devices.Phone;

import java.time.LocalDate;

public class Human extends Animal {
    String firstName;
    String lastName;
    Integer age;
    private Double salary; //Zadanie 3 & 4
    public Animal pet; //Zadanie 1
    public Car myCar; //Zadanie 5
    public Double cash; //Zadanie 8
    public Phone phone;

    //Zadanie 3 & 4
    Human() {
        super("homo sapiens");
        this.salary = 1200.0;
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

    //Zadanie 3 & 4
    Double getSalary() {
        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);
        System.out.println("Wynagrodzenie: " + this.salary);
        return this.salary;
    }

    //Zadanie 5
    void setMyCar(Car myCar) {
        if (salary > myCar.value) {
            System.out.println("Udało się kupić samochód za gotówkę");
            this.myCar = myCar;
        } else if (salary > myCar.value / 12) {
            System.out.println("Udało się kupić samochód na kredyt!");
            this.myCar = myCar;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }

    //Zadanie 5
    public Car getMyCar() {
        return myCar;
    }

    //Zadanie 6
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + salary + " " + pet + getMyCar();
    }
    @Override //Zadanie 8
    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("Handel ludźmi jest nielegalny!!");
    }
}



