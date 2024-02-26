package de.telran.Lection3;

public class CheckClassExample {
    public static void main(String[] args) {
        Object object = 1;

        System.out.println(object.getClass());
        System.out.println(object.getClass() == Integer.class);
        System.out.println(object instanceof Integer);
    }
}
