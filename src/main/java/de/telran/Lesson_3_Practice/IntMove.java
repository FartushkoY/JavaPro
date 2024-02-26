package de.telran.Lesson_3_Practice;

public interface IntMove {
    boolean isWings = false;
    default void move(){
        System.out.println("с помощью ног " + calcSpeed());
    }
    private int calcSpeed() {   //с Java 9
        return 20;
    }




}
