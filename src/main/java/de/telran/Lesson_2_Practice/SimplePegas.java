package de.telran.Lesson_2_Practice;

public class SimplePegas {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        System.out.println(horse1);

        Horse horse2 = new Horse("Вася", 5000, 50);
        System.out.println(horse2);

        Pegasus pegasus1 = new Pegasus("Pegasus", 3000, 60, 50);
        pegasus1.run();
        pegasus1.fly();
        System.out.println(pegasus1);

        Unicorn unicorn1 = new Unicorn("Unicorn", 6000, 40, true);
        unicorn1.run();
        unicorn1.fight();
        System.out.println(unicorn1);

        SwimmingUnicorn swimmingUnicorn1 = new SwimmingUnicorn("Dolphin", 5500, 45, true, 20);
        swimmingUnicorn1.run();
        swimmingUnicorn1.fight();
        swimmingUnicorn1.swim();
        System.out.println(swimmingUnicorn1);


    }
}
