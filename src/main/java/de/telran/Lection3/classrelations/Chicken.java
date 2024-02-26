package de.telran.Lection3.classrelations;

public class Chicken {
    private Egg egg;

    public Chicken() {
        this.egg = new Egg();
    }

    public void setEgg(Egg egg) {
//        this.egg = egg;
    }

//    @Override
//    public String toString() {
//        System.out.println("Chicken" +
//                );
//    }

    public static void main(String[] args) {
        Chicken someChicken = new Chicken();
        Egg someEgg = new Egg();
        someChicken.setEgg(someEgg);
        someEgg.setChicken(someChicken);
    }
}
