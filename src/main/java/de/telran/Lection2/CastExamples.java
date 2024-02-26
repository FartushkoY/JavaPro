package de.telran.Lection2;

import javax.swing.*;

public class CastExamples {

    public static void main(String[] args) {

        Object o = 10;
        Number n = 10;

        Object object = "String";
        object = 10.0;
        object = new Child();
        object = "String value";

        String newLink = (String) object;
        System.out.println(newLink.toUpperCase());

        int intValue = 10;
        Integer integer = 10;

        System.out.println(integer + intValue);
    }
}
