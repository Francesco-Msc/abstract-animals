package org.lessons.java.abstractClasses;

public class Dolphin extends Animal{

    @Override
    void sound() {
        System.out.println("Il delfino fa il suo verso");
    }

    @Override
    void eat() {
        System.out.println("Il delfino mangia pesci...");
    }

}
