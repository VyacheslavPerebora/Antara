package animal_farm;
import animals.Animal;
import java.util.HashSet;


public class AnimalFarm<T extends Animal> {

    private SizeAnimalFarm sizeAnimalFarm;
    private HashSet<T> animalFarm;

    public AnimalFarm(SizeAnimalFarm size) {
        this.sizeAnimalFarm = size;
        this.animalFarm = new HashSet<>();
    }

    public SizeAnimalFarm getSize() { return sizeAnimalFarm; }

    public  void addAnimal(T animal) {
        if (animal.farmSize.getSize() > this.sizeAnimalFarm.getSize()) {
            System.out.println("вольер слишком мал для этого животного!");
        }
        else if (animalFarm.contains(animal)) {
                System.out.println("такое животное уже есть в вольере!");
        }
        else {
            animalFarm.add(animal);
            System.out.println("животное запущено в вольер");
        }
    }

    public  boolean removeAnimal(String nameAnimal) {
        for (Animal animal: animalFarm) {
            if (animal.getName().equals(nameAnimal)) {
                animalFarm.remove(animal);
                System.out.println("животное по имени " + nameAnimal + " выведено из вольера");
                return true;
            }
        }
        System.out.println("такого животного нет в вольере!");
        return false;
    }

    public Animal getRefInstanceAnimalClass (String nameAnimal) {
        return animalFarm.stream()
                .filter(animal -> animal.getName().equals(nameAnimal))
                .findFirst()
                .orElse(null);
    }

    //    public Animal getRefInstanceAnimalClass (String nameAnimal) {
//        for (Animal animal: animalFarm) {
//            if (animal.getName().equals(nameAnimal)) {
//                Animal refAnimal = animal;
//                System.out.println("ссылка на экземпляр класса животного с таким именем получена");
//                return refAnimal;
//            }
//        }
//        System.out.println("такого животного нет в вольере, ссылки на экземпляр не будет, будет null!");
//        return null;
//    }
}
