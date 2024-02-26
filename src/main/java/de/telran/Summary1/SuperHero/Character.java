package de.telran.Summary1.SuperHero;

public abstract class Character {
    private String name;
    private int health = 100;


    public Character(String name) {
        this.name = name;
    }

    public void introduse() {
        System.out.println("Hello, my name is " + name);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }

    public abstract int countForce();

    public abstract int countProtection();

    public void fight(Character another){
        int thisForce = countForce();
        int anotherForce = another.countForce();
        if (thisForce < anotherForce) {
            health = health - (anotherForce - thisForce) / countProtection() ;
            System.out.println(anotherForce + "wins!");
        } else if (thisForce > anotherForce){
            another.health = another.health - (anotherForce - thisForce) / another.countProtection() ;
            System.out.println(thisForce + "wins!");
        } else {
            System.out.println("No one wins");
        }
    }




    public String getName() {
        return name;
    }


    public int getHealth() {
        return health;
    }

}
