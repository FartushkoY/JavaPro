package de.telran.Lection1.house;

public class Robot extends Creature implements Walking, Mousetrap{
    private static int robotCount = 0;

    private static final int ROBOT_DEFAULT_VERSION = 1;

    private String description;

    private int version;

    public Robot(String name, String description, int version) {
       super(name);
        this.description = description;
        this.version = version;
        robotCount++;
    }

    public Robot(String name, String description) {
       super(name);
        this.description = description;
        this.version = ROBOT_DEFAULT_VERSION;
        robotCount++;
    }

    public static void printTotalRobotCount(){
//        System.out.println(this.name); impossible
        System.out.println("Total robot number = " + robotCount);
    }

    public void printCurrentRobotInfo() {
        System.out.println(super.getName() + ", description: " + description + ", version: " + version);
        System.out.println("Total robot number = " + robotCount);
    }

    public void sayHello() {
        System.out.println("Hello! I'm Robot. My name is " + super.getClass().getName());
    }

    @Override
    public void walkAnimal(Animal animal) {
        System.out.println("Robot " + getName() + " walks with " + animal.getName());
        animal.setHungry(true);
    }

    @Override
    public void catchMouse(Mouse mouse) {
        System.out.println("Robot " + getName() + " catch mouse  " + mouse.getName());
    }
}
