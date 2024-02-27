package de.telran.Lection1.house;

public class House {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 2, "white");
        Cat cat2 = new Cat("Vasya", 1, "black");

//        cat1.sayHello();
//        cat2.sayHello();

//        System.out.println(cat1.isHungry());
//        cat1.feed();
//        System.out.println(cat1.isHungry());

//        Robot.printTotalRobotCount();
//
//        Robot robot1 = new Robot("Valuum cleaner", "Robot cleaner");
//        Robot robot2 = new Robot("Washing mashine", "Robot to wash something");
//        robot1.printCurrentRobotInfo();
//        robot2.printCurrentRobotInfo();
//
////        robot1.printTotalRobotCount();
////        robot2.printTotalRobotCount();
//        Robot.printTotalRobotCount();

        Dog dog = new Dog("Jack", 1, "grey");
//        dog.bark();
//        dog.sayHello();
//        dog.feed();

//        Animal animal = dog;
//        animal.displayAnimalInfo();
//        animal = cat1;
//        animal.displayAnimalInfo();

//        Animal animal = new Animal("Jack", "grey", 1);

        Human human = new Human("Harry", 30);
//        human.feedAnimal(dog);
//        human.feedAnimal(dog, cat1, cat2);


        cat2.play(dog);
        System.out.println("------------------");
        dog.play(cat1);
        System.out.println("------------------");
        human.play(cat1);
        System.out.println("------------------");
        dog.play(human);
        System.out.println("------------------");
        human.walkAnimal(dog);
        System.out.println("Is " + dog.getName() + " hungry? " + dog.isHungry());

        Cat blackCat = new BlackCat("Black cat", 1);
        blackCat.play(dog);

        Mouse mouse = new Mouse("Jerry", 1, "white", true);
        mouse.sayHello();
        cat2.catchMouse(mouse);
        Robot robotHelper =new Robot("Smarty", "helper", 1);
        robotHelper.catchMouse(mouse);
        robotHelper.walkAnimal(dog);
        System.out.println(dog.getName() + "'s age is " +  dog.getAge() + " years old");
        dog.grow();
        System.out.println(dog.getName() + "'s age is " +  dog.getAge() + " years old");
        System.out.println(human.getName() + "'s age is " +  human.getAge() + " years old");
        human.grow();
        System.out.println(human.getName() + "'s age is " +  human.getAge() + " years old");
        System.out.println(cat2.getAge() + "'s age is " + cat2.getAge() + " years old");
        cat2.grow();
        System.out.println(cat2.getAge() + "'s age is " + cat2.getAge() + " years old");



    }
}
