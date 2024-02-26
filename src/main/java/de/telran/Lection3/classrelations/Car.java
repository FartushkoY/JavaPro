package de.telran.Lection3.classrelations;

public class Car {

    private final Motor motor = new Motor(); // composition

    private Driver driver; // agregation

    public Car(Driver driver) {
        this.driver = driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public static void main(String[] args) {
        Driver Tom = new Driver();
        Car car = new Car(Tom);

    }

}
