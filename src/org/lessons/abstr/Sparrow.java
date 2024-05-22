package org.lessons.abstr;

public class Sparrow extends Animal{
    @Override
    public void eat() {
        System.out.println("Sparrows eat: meat, fish");
    }

    @Override
    public void call() {
        System.out.println("Chip chip chip");
    }
}
