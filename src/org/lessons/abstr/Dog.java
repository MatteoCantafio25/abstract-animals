package org.lessons.abstr;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dogs eat: meat, fish");
    }

    @Override
    public void call() {
        System.out.println("Woof, woof");
    }
}
