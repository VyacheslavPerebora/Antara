package animals;
import animals.interfaces.Fly;
import animals.interfaces.Swim;
import animals.interfaces.Voice;
import animal_farm.SizeAnimalFarm;


public class Duck extends Carnivore implements Fly, Swim, Voice {

    private int wellFed = 10;

    public Duck(String name) {
        super(name, SizeAnimalFarm.MEDIUM);
    }

    public void setWellFed(int foodUnits) {
        this.wellFed += foodUnits;
    }

    @Override
    public void fly() {
        if (this.wellFed < 1) {
        System.out.println("Не взлететь мне пока не поем");
        }
        else {
        System.out.println("I believe I can fly, I believe I can touch the sky");
        this.wellFed -= 2;
        }
    }

    @Override
    public void swim() {
        if (this.wellFed < 1) {
            System.out.println("Нет сил плыть, надо поесть");
        }
        else {
            System.out.println("Я плыву!");
            this.wellFed -= 1;
             }
    }

    @Override
    public String voice() { return "Кря-кря крякает утка"; }
}
