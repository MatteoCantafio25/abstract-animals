package org.lessons.abstr;

public class Eagle extends Animal implements CanFly{
    @Override
    public void eat() {
        System.out.println("Sparrows eat: meat, fish");
    }

    @Override
    public void call() {
        System.out.println("Screeeech");
    }

    @Override
    public void fly() {
        System.out.println("Im flying!!!");
    }

    public void makeItFly(CanFly animal){
        fly();
    }
}
