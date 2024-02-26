package de.telran.Lesson_2_Practice;

public class Horse {

    protected String name;

    protected int weight;

    protected int speed;

    public void run() {
        System.out.println(name + " бежит со скоростью " + speed);
    }

    public Horse() {
    }

    public Horse(String name, int weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Horse {" +
                " name= " + name +
                " weight= " + weight +
                " speed= " + speed +
                "}";
    }


}
