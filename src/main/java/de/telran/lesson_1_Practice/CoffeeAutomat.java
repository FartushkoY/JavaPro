package de.telran.lesson_1_Practice;

public class CoffeeAutomat {
    private String name;
    private int countTypeCoffee;
    private int countWater;
    static  boolean isButtonSwitch; // наличие кнопки Вкл./выкл.
    private boolean isStatus; // включен автомат или нет


    public CoffeeAutomat() {
    }

    public CoffeeAutomat(String name, int countTypeCoffee, int countWater, boolean isStatus) {
        this.name = name;
        this.countTypeCoffee = countTypeCoffee;
        this.countWater = countWater;
        this.isStatus = isStatus;
    }

    public void getCoffee() {
        System.out.println("Что-то внутри аппарата происходит и автомат " + name + " наливают кофе в стаканчик");
    }
    public void putCoin(int nominal) {
        double action = 1.1;
        System.out.println("Что-то внутри аппарата трещит и на экране появляется сумма " + nominal * action  + " и виды кофе " + countTypeCoffee);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountTypeCoffee(int countTypeCoffee) {
        this.countTypeCoffee = countTypeCoffee;
    }

    public void setCountWater(int countWater) {
        this.countWater = countWater;
    }

    public void setStatus(boolean status) {
        isStatus = status;
    }



}
