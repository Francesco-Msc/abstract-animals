package org.lessons.java.abstractClasses;

public class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Il cane abbaia");
    }

    @Override
    void eat() {
        System.out.println("Il cane mangia le crocchette...");
    }

}
