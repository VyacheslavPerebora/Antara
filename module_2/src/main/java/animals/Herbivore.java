package animals;

import food.Food;
import food.Meat;

abstract class  Herbivore extends Animal{
    @Override
    public  void eat(Food food) {
        if (food instanceof Meat) {System.out.println("Я не ем мясо, дайте растительную пищу пожалуйста");}
        else System.out.println("Вкусно!");
    }
}
