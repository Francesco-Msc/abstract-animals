package org.lessons.java.abstractClasses;

import org.lessons.java.interfaces.Fly;

public class Eagle extends Animal implements Fly{

    @Override
    void sound() {
        System.out.println("L'aquila fa il suo verso");
    }

    @Override
    void eat() {
        System.out.println("L'aquila mangia carne...");
    }

    @Override
    public void fly() {
        System.out.println("L'aquila sta volando");
    }

}
