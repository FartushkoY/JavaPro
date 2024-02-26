package de.telran.Lection2;

public class Parent extends GrandParent {

    public int publicField = 10;

    private  int privateField = 10;

    public void publicMethod() {
        System.out.println("parent public method");
    }

    private void privatMethod() {
        System.out.println("Parent privat method");
    }

    public int getPrivateField() {
        return privateField;
    }

    public void setPrivateField(int privateField) {
        this.privateField = privateField;
    }

}
