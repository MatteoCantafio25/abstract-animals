package org.lessons.abstr;

public class Dolphin extends Animal{
    @Override
    public void eat() {
        System.out.println("Sparrows eat: fish");
    }

    @Override
    public void call() {
        System.out.println("Click click click");
    }
}
