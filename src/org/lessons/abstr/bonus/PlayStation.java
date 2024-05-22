package org.lessons.abstr.bonus;

public class PlayStation implements Call{
    @Override
    public void play() {
        System.out.println("I'm a Playstation and I'm a play mode");
    }

    @Override
    public void stop() {
        System.out.println("I'm a Playstation and I'm a stop mode");
    }
}
