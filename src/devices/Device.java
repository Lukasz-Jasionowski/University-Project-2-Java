package devices;

//Zadanie 7
public abstract class Device {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;
    public Double value;

    public Device(String producer, String model, Integer yearOfProduction, Double value) { //Zadanie 7
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    abstract public void turnOn(); //Zadanie 7

    @Override
    public String toString() { //Zadanie 7
        return "Device{" +
                "Producer: " + producer +
                ", Model: " + model +
                ", yearOfProduction: " + yearOfProduction +
                ", value=" + value +
                '}';
    }
}
