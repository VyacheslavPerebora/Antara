import animals.*;
import food.*;
import animals.interfaces.Swim;

public class Zoo
{
    public static void main(String[] args )
    {
        //carnivores
        Bear bear = new Bear();
        Bison bison = new Bison();
        Fish fish = new Fish();

        //herbivores
        Duck duck = new Duck();
        Elefant elefant = new Elefant();
        Hedgehog hedgehog = new Hedgehog();

        //plant food
        Clover clover = new Clover();
        Cabbage cabbage = new Cabbage();
        Mushroom mushroom = new Mushroom();

        //meat food
        Egg egg = new Egg();
        Knuckle knuckle = new Knuckle();
        PorkLiver liver = new PorkLiver();

        //just call some of the methods
        bear.run();
        bison.run();
        fish.swim();
        duck.fly();
        elefant.run();
        hedgehog.run();

        //zoo worker
        Worker worker = new Worker();

        worker.feed(bear, clover);
        worker.feed(bear, liver);
        worker.feed(bison, cabbage);
        worker.feed(bison, knuckle);
        worker.feed(fish, mushroom);
        worker.feed(fish, egg);

        worker.feed(duck, liver);
        worker.feed(duck, clover);
        worker.feed(elefant, knuckle);
        worker.feed(elefant, cabbage);
        worker.feed(hedgehog, egg);
        worker.feed(hedgehog, mushroom);

        worker.getVoice(bear);
        worker.getVoice(bison);
        //worker.getVoice(fish); рыба не умеет говорить, программа не скомпилируется если раскомментировать строку
        worker.getVoice(duck);
        worker.getVoice(elefant);
        worker.getVoice(hedgehog);

        //create pond
        Swim[] pond = new Swim[4];

        pond[0] = new Fish();
        pond[1] = new Fish();
        pond[2] = new Duck();
        pond[3] = new Duck();


        for (Swim animal : pond) {
            animal.swim();
        }
    }
}
