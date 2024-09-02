import model.Kotik;

public class App
{
    public static void main( String[] args )
    {
        Kotik k_1 = new Kotik(5, "Мурка", 2, "Мяу");
        Kotik k_2 = new Kotik();
        k_2.setKotik(5, "Чешир", 3, "Мяу");
        k_2.liveAnotherDay();
        System.out.println("имя котика " + k_2.getName());
        System.out.println("вес котика " + k_2.getWeight());

        System.out.println(k_1.getMeow().equals(k_2.getMeow()));
        System.out.println("количество котиков, созданных в процессе выполнения программы " + Kotik.getInstanceCountKotiks());

    }
}