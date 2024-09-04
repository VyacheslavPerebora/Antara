package animals;

import animals.interfaces.Run;
import animals.interfaces.Voice;

public class Elefant extends Herbivore implements Run, Voice {

    private int wellFed = 20;

    public void setWellFed(int foodUnits) { this.wellFed += foodUnits; }

    @Override
    public void run() {

        if (this.wellFed < 1) {
            System.out.println("Не могу бежать, надо поесть");
        }
        else {
            System.out.println("Я бегу");
            this.wellFed -= 2;
        }
    }

    @Override
    public String voice() {
        return "У-у-у трубит довольный слон";
    }
}
