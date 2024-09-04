import animals.Animal;
import animals.interfaces.Voice;
import food.Food;

public class Worker {
    public void feed(Animal animal, Food food) {
        animal.eat(food);
        animal.setWellFed(food.getFoodUnits());
    }
    public void getVoice(Voice talking_animal) {
        System.out.println(talking_animal.voice());
        }
    }

