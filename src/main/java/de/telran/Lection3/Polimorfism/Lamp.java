package de.telran.Lection3.Polimorfism;

public class Lamp implements Switchable{

    private boolean isOn;

    public void on(boolean on) {
        isOn = on;
    }

    public void checkState() {
        System.out.println("Lamp is " + ((isOn) ? "on" : "off"));
    }

}
