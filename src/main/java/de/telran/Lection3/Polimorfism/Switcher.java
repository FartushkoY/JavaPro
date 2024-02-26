package de.telran.Lection3.Polimorfism;

public class Switcher {

    private Switchable switchable;

    public Switcher(Lamp lamp) {
        this.switchable = lamp;
    }



    public void switchOn() {
        switchable.on(true);
    }

    public void switchOff() {
        switchable.on(false);
    }

    public Switchable getLamp() {
        return switchable;
    }


    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Switcher switcher = new Switcher(lamp);
        switcher.switchOn();
        lamp.checkState();
        switcher.switchOff();
        lamp.checkState();


    }
}
