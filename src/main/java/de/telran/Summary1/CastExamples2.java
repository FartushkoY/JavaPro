package de.telran.Summary1;

public class CastExamples2 {
    public static void main(String[] args) {
        int i = 10000;

        long j = i;

        byte k = (byte) i;
        System.out.println(k);

        long l = 10000000000L;
        i= (int) l;
        System.out.println(i);

    }
}
