package de.telran.Lection2;

public class Child extends Parent{
    public String name = "Name";

    public int publicField = 20;

    public void method() {
        System.out.println("child method" + publicField);
        System.out.println("child method" + super.publicField);
    }

    @Override
    public void publicMethod() {
//        super.publicMethod();
        System.out.println("child public method");
    }

}
