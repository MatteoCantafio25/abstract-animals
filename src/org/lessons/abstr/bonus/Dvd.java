package org.lessons.abstr.bonus;

public class Dvd implements Call{

    @Override
    public void play() {
        System.out.println("I'm a Dvd and I'm a play mode");
    }

    @Override
    public void stop() {
        System.out.println("I'm a Dvd and I'm a stop mode");
    }
}
