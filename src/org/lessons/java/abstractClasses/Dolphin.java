package org.lessons.java.abstractClasses;

import org.lessons.java.interfaces.Swim;

public class Dolphin extends Animal implements Swim{

    @Override
    void sound() {
        System.out.println("Il delfino fa il suo verso");
    }

    @Override
    void eat() {
        System.out.println("Il delfino mangia pesci...");
    }

    @Override
    public void swim(){
        System.out.println("Il delfino sta nuotando");
    }

}
