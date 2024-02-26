package de.telran.Summary1.SuperHero;

public class Weapon {
    private String name;
    private int level;

    public Weapon(String name, int level) {
        this.name = name;
        this.level = level;
    }






    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
