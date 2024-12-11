package org.lessons.java.abstractClasses;

public class TestAnimals {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal sparrow = new Sparrow();
        Animal eagle = new Eagle();
        Animal dolphin = new Dolphin();

        dog.sleep();
        dog.sound();
        dog.eat();
        System.out.println("-------");
        sparrow.sleep();
        sparrow.sound();
        sparrow.eat();
        System.out.println("-------");
        eagle.sleep();
        eagle.sound();
        eagle.eat();
        System.out.println("-------");
        dolphin.sleep();
        dolphin.sound();
        dolphin.eat();
    }
}
