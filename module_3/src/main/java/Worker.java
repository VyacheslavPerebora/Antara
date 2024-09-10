import animals.Animal;
import animals.interfaces.Voice;
import exception.WrongFoodException;
import food.Food;


public class Worker {
    public void feed(Animal animal, Food food)  {
        try {
            animal.eat(food);
            animal.setWellFed(food.getFoodUnits());
        }
        catch (WrongFoodException e) {
            System.out.println(e.getMessage());
            System.out.println("Исключение успешно обработано!");
        }
    }

    public void getVoice(Voice talking_animal) {
        System.out.println(talking_animal.voice());
    }
}
