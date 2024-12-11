package org.lessons.java.abstractClasses;

import org.lessons.java.interfaces.Fly;
import org.lessons.java.interfaces.Swim;

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
        ((Fly) sparrow).fly();
        System.out.println("-------");
        eagle.sleep();
        eagle.sound();
        eagle.eat();
        ((Fly) eagle).fly();
        System.out.println("-------");
        dolphin.sleep();
        dolphin.sound();
        dolphin.eat();
        ((Swim) dolphin).swim();
    }
}
