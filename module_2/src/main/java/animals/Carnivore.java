package animals;

import food.Food;
import food.Grass;

abstract class Carnivore extends Animal{
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {System.out.println("Я не ем овощи, дайте мясное пожалуйста");}
        else System.out.println("Вкусно и точка!");
    }
}
