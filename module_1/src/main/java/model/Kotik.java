package model;

import java.util.Random;

public class Kotik {
    private static int instanceCountKotiks = 0;
    private int wellFed = 10;
    private int prettiness;
    private String name;
    private int weight;
    private String meow;

    public Kotik() {
        ++instanceCountKotiks;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        ++instanceCountKotiks;
        if (prettiness < 1) {
            System.out.println("мимишность не может быть меньше 1");
        } else {
            this.prettiness = prettiness;
        }

        this.name = name;
        if (weight < 1) {
            System.out.println("вес котика не может быть меньше 1");
        } else {
            this.weight = weight;
        }

        this.meow = meow;
    }

    public void setKotik(int prettiness, String name, int weight, String meow) {
        if (prettiness < 1) {
            System.out.println("мимишность не может быть меньше 1");
        } else {
            this.prettiness = prettiness;
        }

        this.name = name;
        if (weight < 1) {
            System.out.println("вес котика не может быть меньше 1");
        } else {
            this.weight = weight;
        }

        this.meow = meow;
    }

    public static int getInstanceCountKotiks() {
        return instanceCountKotiks;
    }

    public void eat(int foodUnits) {
        if (this.wellFed + foodUnits > 20) {
            System.out.println("Я маленький кот и мне столько не съесть, но я постараюсь");
            this.wellFed = 20;
        } else {
            this.wellFed += foodUnits;
            System.out.println("Котик поел");
        }

    }

    public void eat(int foodUnits, String foodName) {
        if (this.wellFed + foodUnits > 20) {
            System.out.println("Я маленький кот и мне не съесть столько " + foodName + ", но я постараюсь");
            this.wellFed = 20;
        } else {
            this.wellFed += foodUnits;
            System.out.println("Котик поел");
        }

    }

    public void eat() {
        this.eat(2, "Корюшка");
    }

    public boolean sleep() {
        if (this.wellFed < 1) {
            System.out.println("Не хочу спать, хочу кушоть");
            return false;
        } else {
            System.out.println("Мне снились электромыши");
            this.wellFed -= 2;
            return true;
        }
    }

    public boolean play() {
        if (this.wellFed < 1) {
            System.out.println("Не хочу играть, хочу кушоть");
            return false;
        } else {
            System.out.println("Мы играли с жуком");
            --this.wellFed;
            return true;
        }
    }

    public boolean tailChase() {
        if (this.wellFed < 1) {
            System.out.println("Не хочу ловить хвост, хочу кушоть");
            return false;
        } else {
            System.out.println("Хвост успешно пойман");
            this.wellFed -= 2;
            return true;
        }
    }

    public boolean sofaScratch() {
        if (this.wellFed < 1) {
            System.out.println("Не хочу драть диван, хочу кушоть");
            return false;
        } else {
            System.out.println("Диван подран успешно");
            this.wellFed -= 2;
            return true;
        }
    }

    public boolean loudlyPurr() {
        if (this.wellFed < 1) {
            System.out.println("Не хочу урчать, хочу кушоть");
            return false;
        } else {
            System.out.println("Котик заурчал");
            this.wellFed -= 2;
            return true;
        }
    }

    public void liveAnotherDay() {
        for(int i = 0; i < 24; ++i) {
            Random random = new Random();
            int r = random.nextInt(5) + 1;
            switch (r) {
                case 1:
                    boolean s = this.sleep();
                    if (!s) {
                        this.eat(2);
                    }
                    break;
                case 2:
                    boolean p = this.play();
                    if (!p) {
                        this.eat(2, "свиная кожа");
                    }
                    break;
                case 3:
                    boolean t = this.tailChase();
                    if (!t) {
                        this.eat();
                    }
                    break;
                case 4:
                    boolean sofa = this.sofaScratch();
                    if (!sofa) {
                        this.eat(2, "куриное крылышко");
                    }
                    break;
                case 5:
                    boolean l = this.loudlyPurr();
                    if (!l) {
                        this.eat(1);
                    }
            }
        }

    }

    public String getName() {
        return this.name;
    }

    public int getPrettiness() {
        return this.prettiness;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getMeow() {
        return this.meow;
    }
}

