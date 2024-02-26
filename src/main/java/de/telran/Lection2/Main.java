package de.telran.Lection2;

public class Main {
    public static void main(String[] args) {
//        Parent parent = new Parent();
//        Child child = new Child();
//
//        System.out.println(child.publicField);
//        child.publicMethod();
//
//        System.out.println(child.getPrivateField());
//        child.publicMethod();

        Parent entity = null;
        boolean condition = true;

        if (condition) {
            entity = new Parent();      // в зависимости от соблюдения условия, объект будет создаваться
        } else {                        // родительского или дочернего класса
            entity = new Child();
        }
        entity.publicMethod();


        entity = new Parent();
        entity.publicMethod();  //метод будет вызван из child

        entity = new Parent();
        entity.publicMethod();  //метод будет вызван из  parent

        Parent child = new Child();
        Parent childTwo = new ChildTwo();

        processEntity(child);
        processEntity(childTwo);
    }

    public static void processEntity(Parent parent) {
        if (parent.getClass().equals(Child.class)) {
            ((Child) parent).method();
        }
        System.out.println("processing " + parent.getClass().getSimpleName());
    }
}
