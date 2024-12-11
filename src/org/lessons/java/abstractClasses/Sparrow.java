package org.lessons.java.abstractClasses;

public class Sparrow extends Animal{

    @Override
    void sound() {
        System.out.println("Il passerotto cinguetta");
    }

    @Override
    void eat() {
        System.out.println("Il passerotto mangia semi...");
    }

}
