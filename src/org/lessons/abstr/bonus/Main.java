package org.lessons.abstr.bonus;

public class Main {
    public static void main(String[] args) {
        Dvd dvd = (Dvd) Creator.create("dvd");
        dvd.play();
        dvd.stop();

        PlayStation playstation = (PlayStation) Creator.create("playstation");
        playstation.play();
        playstation.stop();
    }
}
