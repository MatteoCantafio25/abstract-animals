package org.lessons.abstr;

public class Eagle extends Animal{
    @Override
    public void eat() {
        System.out.println("Sparrows eat: meat, fish");
    }

    @Override
    public void call() {
        System.out.println("Screeeech");
    }
}
