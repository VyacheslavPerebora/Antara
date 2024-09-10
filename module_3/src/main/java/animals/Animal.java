package animals;
import food.Food;
import java.util.Objects;
import animal_farm.SizeAnimalFarm;
import exception.WrongFoodException;


public abstract class Animal {

    private String name;
    public final SizeAnimalFarm farmSize;

    public Animal(String name, SizeAnimalFarm farmSize) {
        this.name = name;
        this.farmSize = farmSize;
    }

    public abstract void eat(Food food) throws WrongFoodException;

    public abstract  void setWellFed(int foodUnits);

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal other = (Animal) obj;
        return Objects.equals(this.name, other.name);
    }

    public String getName() {
        return this.name;
    }
}