package de.telran.Lesson_2_Practice;

public class SwimmingUnicorn extends Unicorn{

    private int speedSweem;

    public SwimmingUnicorn(String name, int weight, int speed, boolean isHorn, int speedSweem) {
        super(name, weight, speed, isHorn);
        this.speedSweem = speedSweem;
    }

    public void swim() {
        System.out.println(name + " плавает со скоростью " + speedSweem);
    }

    @Override
    public String toString() {
        return "SwimmingUnicorn{" +
                "speedSweem= " + speedSweem +
                ", name=" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                " isHorn=" + super.isHorn() +
                '}';
    }
}
