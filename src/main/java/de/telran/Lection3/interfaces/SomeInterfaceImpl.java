package de.telran.Lection3.interfaces;

public class SomeInterfaceImpl implements SomeInterface{

    @Override
    public void someMethod() {
        System.out.println("someMethod");
    }

    @Override
    public String someMethod(String s) {
        return s;
    }

    public static void main(String[] args) {
        SomeInterface someInterface = new SomeInterfaceImpl();
        someInterface.someMathod();
        System.out.println(someInterface.someMathod2());
    }
}
