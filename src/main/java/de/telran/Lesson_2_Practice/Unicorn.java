package de.telran.Lesson_2_Practice;

public class Unicorn extends Horse{

    private boolean isHorn;
    public void fight() {
        System.out.println(name + " бьет, есть ли у нео рог  " + isHorn);
    }

    public Unicorn(String name, int weight, int speed, boolean isHorn) {
        super(name, weight, speed);
        this.isHorn = isHorn;
    }

    @Override
    public String toString() {
        return "Unicorn{" +
                "isHorn=" + isHorn +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }

    public boolean isHorn() {
        return isHorn;
    }

    public void setHorn(boolean horn) {
        isHorn = horn;
    }
}
