package food;

public class Egg extends Meat{

    final private int foodUnits = 3;

    @Override
    public int getFoodUnits() {
        return foodUnits;
    }
}
