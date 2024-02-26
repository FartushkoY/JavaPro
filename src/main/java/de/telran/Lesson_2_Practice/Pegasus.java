package de.telran.Lesson_2_Practice;

public class Pegasus extends Horse{

    private int speedFly;

    public Pegasus(String name, int weight, int speed, int speedFly) {
        super(name, weight, speed);
        this.speedFly = speedFly;
    }

    public void fly() {
        System.out.println(name + " летает со скоростью " + speedFly);
    }

    @Override
    public String toString() {
        return "Pegasus{" +
                "speedFly=" + speedFly +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
