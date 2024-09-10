package animal_farm;

public enum SizeAnimalFarm {

    SMALL(10),
    MEDIUM(40),
    LARGE(70),
    EXTRA_LARGE(100);

    private final int size;

    SizeAnimalFarm(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

}
