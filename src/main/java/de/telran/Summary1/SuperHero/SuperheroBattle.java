package de.telran.Summary1.SuperHero;

public class SuperheroBattle {
    public static void main(String[] args) {
        Superhero superhero1 = new Superhero("Iron Man", 50, new Protection("Armor", 67), new Weapon("Iron", 45));
       Superhero superhero2 = new Superhero("Thor", 55, new Protection("Mjolnir", 75), new Weapon("Thunder", 45));

    EvilCreature evilCreature1 = new EvilCreature("Lockie", 20, 45);
    EvilCreature evilCreature2 = new EvilCreature("Thanos", 53, 56);

    superhero1.introduce(superhero1.getName());
    superhero2.introduce(superhero2.getName());
    evilCreature1.introduse();
    evilCreature2.introduse();

        System.out.println(evilCreature1);



    }
}
