package animals;
import food.Food;
import food.Grass;
import animal_farm.SizeAnimalFarm;
import exception.WrongFoodException;

public abstract class Carnivore extends Animal{

    public Carnivore(String name, SizeAnimalFarm farmSize) {
        super(name, farmSize);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            throw new WrongFoodException("Я не ем овощи, дайте мясное пожалуйста");
        } else System.out.println("Вкусно и точка!");;
    }
}
