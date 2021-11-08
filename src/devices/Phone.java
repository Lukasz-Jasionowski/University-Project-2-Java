package devices;

import com.company.Human;
import com.company.Saleable;

import java.awt.*;

public class Phone extends Device implements Saleable { //Zadanie 7 ↓
    Double screenSize;
    String os;
    public Double value;

    public Phone(String producer, String model, Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Przytrzymuję włącznik");
    } //Zadanie 7

    @Override //Zadanie 8 ↓
    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("Kupujący ma za mało pieniędzy.");
        } else if (seller.phone == null) {
            System.out.println("Sprzedający nie ma żadnego telefonu.");
        } else if (!seller.phone.equals(this)) {
            System.out.println("Sprzedający nie ma tego modelu telefonu.");
        } else {
            //wymiana kasy
            seller.cash += price;
            buyer.cash -= price;
            //wymiana telefonu
            seller.phone = null;
            buyer.phone = this;
            System.out.println("Transakcja się udała, kupiono " + this);
        }
    }
}
