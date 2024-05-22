package org.lessons.abstr;

public class Dolphin extends Animal implements CanSwim{
    @Override
    public void eat() {
        System.out.println("Sparrows eat: fish");
    }

    @Override
    public void call() {
        System.out.println("Click click click");
    }

    @Override
    public void swim() {
        System.out.println("Im swimming!!!");
    }

    public void makeItSwim(CanSwim animal){
        swim();
    }
}
