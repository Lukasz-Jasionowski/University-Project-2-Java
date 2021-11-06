package devices;

//Zadanie 2
public class Car extends Device{//Zadanie 7
    public Integer howManyDoors;
  //  public Double value; //Zadanie 5

    public Car(String producer, String model, Integer howManyDoors, Integer yearOfProduce, Double value){
        super(producer,model,yearOfProduce);
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
    public String toString(){
        return producer + " " + model + " " + howManyDoors + " " + yearOfProduction + " " + value;
    }
}