package devices;

import com.company.Human;
import com.company.Saleable;

import java.util.List;
import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device implements Saleable {
    private static final String DEFAULT_APP_VERSION = "Latest Version"; //Zadanie 7 ↓
    private static final String DEFAULT_SERVER_NAME = "wsb.apps.pl";
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

    public void instalAnApp(String appName) {
        System.out.println("Instalowanie aplikacji " + appName);
        this.instalAnApp(appName, DEFAULT_APP_VERSION);
    }

    public void instalAnApp(String appName, String version) {
        System.out.println("Instalowanie aplikacji " + appName + " w wersji " + version);
        this.instalAnApp(appName, version, DEFAULT_SERVER_NAME);
    }

    public void instalAnApp(String appName, String version, String server) {
        try{
            URL url = new URL("https", server, 443, appName + "-" + version);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    public void instalAnApp(URL url) {
        System.out.println("Strona " + url + " bezpieczna");
        System.out.println("Jest miejsce na dysku");
        System.out.println("Aplikacja jest darmowa");
        System.out.println("Aplikacja");
        System.out.println("Trwa pobieranie aplikacji");
        System.out.println("Trwa rozpakowywanie aplikacji");
        System.out.println("Trwa instalacja aplikacji");
        System.out.println("Aplikacja zainstalowana");
    }
    public void instalAnApp(List<String> appNames) {
        for (String appName : appNames) {
            this.instalAnApp(appName);
        }
    }
}
