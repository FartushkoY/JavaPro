package de.telran.Lection1.house;

public class Cat extends Animal {

    public Cat(String catName) {
        this(catName, "white", 1);
    }

    public Cat(String catName, String catColour, int catAge) {
        super(catName, catColour, catAge, true);
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
}
