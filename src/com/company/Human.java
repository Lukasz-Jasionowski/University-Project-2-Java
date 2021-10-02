package com.company;

import java.time.LocalDate;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    private Car myCar;

    Human() {
        this.salary = 1200.0;
    }

    void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Nowe dane zostały wysłąne do systemu księgowego ");
            System.out.println("Proszę odebrać aneks do umowy od pani Hani");
            System.out.println("ZUS i US już wiedzą o zmanie wypłaty i nie masensu uciekać");
            this.salary = salary;
        } else if (salary < 0) {
            System.out.println("Error! Ujemna wartość!");
        }
    }

    Double getSalary() {
        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);
        System.out.println("Wynagrodzenie: " + this.salary);
        return this.salary;
    }

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

    Car getMyCar() {
        return myCar;
    }
}
