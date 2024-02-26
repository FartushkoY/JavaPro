package de.telran.Summary1.SuperHero;

import java.util.Random;

public class EvilCreature extends Character{
    private int force;
    private int protection;


    public EvilCreature(String name,int force, int protection) {
        super(name);
        this.protection = protection;
    }



    public static void generateRandomEvilCreature(){
        Random random = new Random();

    }

    @Override
    public String toString() {
        return "EvilCreature{" + "name " + getName() +
                " force=" + force +
                ", protection=" + protection +
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
