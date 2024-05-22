package org.lessons.abstr;

public class Dog extends Animal implements CanSwim{
    @Override
    public void eat() {
        System.out.println("Dogs eat: meat, fish");
    }

    @Override
    public void call() {
        System.out.println("Woof, woof");
    }

    @Override
    public void swim() {
        System.out.println("Im swimming!!!");
    }

    public void makeItSwim(CanSwim animal){
        swim();
    }
}
