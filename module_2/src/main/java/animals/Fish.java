package animals;

import animals.interfaces.Swim;

public class Fish extends Carnivore implements Swim {

    private int wellFed = 5;

    @Override
    public void setWellFed(int foodUnits) {  this.wellFed += foodUnits; }

    @Override
    public void swim() {
        if (this.wellFed < 1) {
            System.out.println("Нет сил плыть, надо поесть");
        }
        else {
            System.out.println("Я плыву!");
            this.wellFed -= 2;
        }
}}
