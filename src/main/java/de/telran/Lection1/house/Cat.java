package de.telran.Lection1.house;

public class Cat extends Animal implements Mousetrap{

    public Cat(String catName) {
        this(catName, 1, "white");
    }

    public Cat(String catName, int catAge, String catColour) {
        super(catName, catAge, catColour, true);
    }


    @Override
    public void sayHello() {
        System.out.println("Meow! I'm cat. My name is " + super.getName());
    }

    @Override
    public void play(Creature another) {
        if (another instanceof Dog) {
            System.out.println("Cat " + super.getName() + " is playing with dog " + another.getName() + ". Cat runs away.");
        } else {
            super.play(another);
        }
    }


    public void meow() {
        System.out.println("Meow!");
    }

    @Override
    public void catchMouse(Mouse mouse) {
        System.out.println("Cat " + getName() + " catch mouse  " + mouse.getName());
    }
}
