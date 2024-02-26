package de.telran.Lection1.house;

public class Dog extends Animal {

    public Dog(String name, String colour, int age) {
        super(name, colour, age, true);
    }

    @Override
    public void sayHello() {
        System.out.println("Gav! I'm dog. My name is " + super.getName());
    }

    public void bark() {
        System.out.println("Gav! Gav!");
    }

    @Override
    public void play(Creature another) {
       if (another instanceof Cat) {
           System.out.println("Dog " + super.getName() + " is playing with cat " + another.getName() + ".");
           bark();
       } else {
           super.play(another);
       }
    }
}
