package devices;

import com.company.Human;
import com.company.Saleable;

import java.util.AbstractList;
import java.util.ArrayList;

//Zadanie 2
public abstract class Car extends Device implements Saleable {//Zadanie 7
    public Integer howManyDoors;
    //  public Double value; //Zadanie 5


    public Car(String producer, String model, Integer howManyDoors, Integer yearOfProduce, Double value) {
        super(producer, model, yearOfProduce, value);
        this.howManyDoors = howManyDoors;
        this.value = value;
    }

    //Zadanie 6
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof Car) {
            Car o = (Car) object;
            if (producer.equals(o.producer) && model.equals(o.model) && howManyDoors == o.howManyDoors && yearOfProduction == o.yearOfProduction && value.equals(o.value)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 7;
        result = 31 * result + producer.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + howManyDoors;
        result = 31 * result + yearOfProduction;
        result = 31 * result + value.hashCode();
        return result;

    }

    @Override
    public void turnOn() {
        System.out.println("Przekręcam kluczyk");
    } //Zadanie 7

    @Override //Zadanie 8
    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("Kupujący ma za mało pieniędzy.");
        } else if (!seller.hasCar(this)) {
            System.out.println("Sprzedający nie ma żadnego samochodu.");
        } else if (carOwners.get(carOwners.size() - 1) != seller.firstName) {
            System.out.println("Sprzedający nie jest ostatnim właśicielem");
        } else if (!buyer.hasFreeParkingLot()) {
            System.out.println("Kupujący nie mia miejsca");
        } else {
            //wymiana kasy
            seller.cash += price;
            buyer.cash -= price;
            //wymiana samochodów
            seller.removeCar(this);
            buyer.addCar(this);
            System.out.println("Transakcja się udała, kupiono " + this);
            carOwners.add(buyer.name);
        }
    }

    abstract public void refuel();

    public ArrayList<String> carOwners = new ArrayList<String>();

    public void wasAnOwner() {
        if (carOwners.size() == 0) {
            System.out.println("Nie było jeszcze pierwszego właściciela pojazdu");
        } else {
            System.out.println("Właścicielami pojazdu byli: " + carOwners);
        }
    }

    public void isHeSoldHim(Human seller, Human buyer) {
        for (int i = 0; i < carOwners.size(); i++) {
            if (carOwners.get(i) == seller.firstName && carOwners.get(++i) == buyer.firstName) {
                System.out.println("Tak! " + seller.firstName + " sprzedał samochód " + buyer.firstName);
            } else {
                System.out.println("Nie! " + seller.firstName + " nie sprzedał samochodu " + buyer.firstName);
            }
        }
    }

    public void howManyTimesSold() {
        System.out.println("Sprzedano: " + carOwners.size() + " razy");
    }
}