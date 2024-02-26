package de.telran.Lection1.house;

public class Human extends Creature {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        animal.feed();
    }

    public void feedAnimal(Animal... animals) {
        for (Animal a : animals) {
            a.feed();
        }
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! My name is " + super.getName() + "I am is human.");
    }

    public void walkAnimal(Animal animal) {
        System.out.println(getName() + " walking with " + animal.getName());
        animal.setHungry(true);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
