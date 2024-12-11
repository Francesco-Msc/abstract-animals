package org.lessons.java.abstractClasses;

import org.lessons.java.interfaces.Fly;

public class Sparrow extends Animal implements Fly{

    @Override
    void sound() {
        System.out.println("Il passerotto cinguetta");
    }

    @Override
    void eat() {
        System.out.println("Il passerotto mangia semi...");
    }

    @Override
    public void fly() {
        System.out.println("Il passerotto sta volando");
    }

}
