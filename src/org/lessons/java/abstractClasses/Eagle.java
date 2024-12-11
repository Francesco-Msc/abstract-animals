package org.lessons.java.abstractClasses;

public class Eagle extends Animal{

    @Override
    void sound() {
        System.out.println("L'aquila fa il suo verso");
    }

    @Override
    void eat() {
        System.out.println("L'aquila mangia carne...");
    }

}
