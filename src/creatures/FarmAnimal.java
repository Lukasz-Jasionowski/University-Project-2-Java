package creatures;

//Zadanie 9 ↓
public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("Zwierze jest jadalne!");
    }

    @Override
    public void feed() {
        System.out.println("Zwierze hodowlane zostało nakarmione");
    }

    @Override
    public void feed(Double foodWeight) {
        System.out.println("Zwierze hodowlane zostało nakarmione, a waga jedzenia wyniosła " + foodWeight + "kg");
    }
}
