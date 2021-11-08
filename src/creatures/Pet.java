package creatures;

//Zadanie 9 ↓
public class Pet extends Animal {
    public Pet(String species, String name, Integer age, Boolean alive) {
        super(species);
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    @Override
    public void feed() {
        System.out.println("Zwierze zostało nakarmione");
    }

    @Override
    public void feed(Double foodWeight) {
        System.out.println("Zwierze zostało nakarmione, a waga jedzenia wyniosła " + foodWeight + "kg");
    }
}
