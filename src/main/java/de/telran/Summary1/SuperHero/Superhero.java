package de.telran.Summary1.SuperHero;

import java.util.HashMap;

public class Superhero extends Character {

    private int force;
    private Protection protection;
    private Weapon weapon;

    public Superhero(String name, int force, Protection protection, Weapon weapon) {
        super(name);
        this.force = force;
        this.protection = protection;
        this.weapon = weapon;
    }

    public void introduce(String name) {
        System.out.println("Hello, i am " + name);
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "force=" + force +
                ", protection=" + protection +
                ", weapon=" + weapon +
                '}';
    }

    @Override
    public int countForce() {
        return 0;
    }

    @Override
    public int countProtection() {
        return 0;
    }


}
