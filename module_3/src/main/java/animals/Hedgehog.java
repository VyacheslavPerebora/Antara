package animals;
import animal_farm.SizeAnimalFarm;
import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Hedgehog extends Herbivore implements Run, Voice {

    private int wellFed = 5;

    public Hedgehog(String name) {
        super(name, SizeAnimalFarm.SMALL);
    }

    public void setWellFed(int foodUnits) {
        this.wellFed += foodUnits;
    }

    @Override
    public void run() {
        if (this.wellFed < 1) {
            System.out.println("Не могу бежать, надо поесть");
        }
        else {
            System.out.println("Я бегу!");
            this.wellFed -= 2;
        }
    }

    @Override
    public String voice() {
        return "Фыр-фыр фыркает ёж";
    }
}
