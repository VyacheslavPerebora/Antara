import animal_farm.AnimalFarm;
import animal_farm.SizeAnimalFarm;
import animals.*;
import food.*;

public class Zoo
{
    public static void main(String[] args ) {
        // carnivores
        Bear bear = new Bear("Пушистый");
        Fish fish = new Fish("Сом");
        Duck duck = new Duck("Кряква");
        // herbivores
        Bison bison = new Bison("Пафнутий");
        Elefant elefant = new Elefant("Ушастый");
        Hedgehog hedgehog = new Hedgehog("Шуршун");

        // plant food
        Clover clover = new Clover();
        Cabbage cabbage = new Cabbage();
        Mushroom mushroom = new Mushroom();
        // meat food
        Egg egg = new Egg();
        Knuckle knuckle = new Knuckle();
        PorkLiver liver = new PorkLiver();

        // zoo worker
        Worker worker = new Worker();

        // кормление животных неподходящей пищей, исключение обрабатывается в методе feed(. .) класса Worker.
        worker.feed(bear, clover);
        worker.feed(duck, cabbage);
        worker.feed(fish, mushroom);
        worker.feed(bison, knuckle);
        worker.feed(elefant, liver);
        worker.feed(hedgehog, egg);

        // создаем вольер для хищников размера MEDIUM
        AnimalFarm<Carnivore> animalCarniFarm = new AnimalFarm<>(SizeAnimalFarm.MEDIUM);

        // пример ограничения на добавление травоядных в вольер для хищников через механизм обобщений.
        // если раскомментировать строку ниже с помещением травоядного ежа в вольер для хищников то программа не скомпилируется
        // animalCarniFarm.addAnimal(hedgehog);

        // помещаем хищников в вольер (медведь не поместится т.к. ему нужен вольер LARGE, о чем будет сообщение)
        animalCarniFarm.addAnimal(bear);
        animalCarniFarm.addAnimal(fish);
        animalCarniFarm.addAnimal(duck);

        //пример получения ссылки на экземпляр животного по имени
        Animal refAnimalC = animalCarniFarm.getRefInstanceAnimalClass("Сом");
        //пример удаления животного из вольера по имени
        animalCarniFarm.removeAnimal("Сом");


        // создаем вольер для травоядных размера LARGE
        AnimalFarm<Herbivore> animalHerbiFarm = new AnimalFarm<>(SizeAnimalFarm.LARGE);

        // пример ограничения на добавление хищников в вольер для травоядных через механизм обобщений.
        // если раскомментировать строку ниже с помещением хищной утки в вольер для травоядных то программа не скомпилируется
        // animalHerbiFarm.addAnimal(duck);

        // помещаем травоядных в вольер (слон не поместится т.к. ему нужен вольер EXTRA_LARGE, о чем будет сообщение)
        animalHerbiFarm.addAnimal(elefant);
        animalHerbiFarm.addAnimal(bison);
        animalHerbiFarm.addAnimal(hedgehog);

        // пример получения ссылки на экземпляр животного по имени
        Animal refAnimalH = animalHerbiFarm.getRefInstanceAnimalClass("Пафнутий");
        // пример удаления животного из вольера по имени
        animalHerbiFarm.removeAnimal("Пафнутий");


        // создаем еще один вольер для травоядных и пробуем добавить в него два экземпляр слона по имени "Ушастый"
        AnimalFarm<Herbivore> animalHerbiFarm2 = new AnimalFarm<>(SizeAnimalFarm.EXTRA_LARGE);
        Elefant elefant1 = new Elefant("Ушастый");
        Elefant elefant2 = new Elefant("Ушастый");
        animalHerbiFarm2.addAnimal(elefant1);
        // код ниже вернет сообщение "такое животное уже есть в вольере!" т.к. идентификатор животного его имя (переписали методы equals hashCode в классе Animal)
        animalHerbiFarm2.addAnimal(elefant2);
    }
}
