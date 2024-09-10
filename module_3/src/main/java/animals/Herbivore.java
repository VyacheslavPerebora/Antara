package animals;
import food.Food;
import food.Meat;
import animal_farm.SizeAnimalFarm;
import exception.WrongFoodException;

public abstract class Herbivore extends Animal {

    public Herbivore(String name, SizeAnimalFarm farmSize) {
        super(name, farmSize);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            throw new WrongFoodException("Я не ем мясо, дайте растительную пищу пожалуйста");
        } else System.out.println("Вкусно!");;
    }
}
