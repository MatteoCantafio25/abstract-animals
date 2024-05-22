package org.lessons.abstr;

public class Main {
    public static void main(String[] args) {
        // Esercizio: step 1

        Dog dog = new Dog();
        Sparrow sparrow = new Sparrow();
        Dolphin dolphin = new Dolphin();
        Eagle eagle = new Eagle();

        System.out.println("*****DOG*****");
        dog.sleep();
        dog.call();
        dog.eat();
        System.out.println("*****SPARROW*****");
        sparrow.sleep();
        sparrow.call();
        sparrow.eat();
        System.out.println("*****DOLPHIN*****");
        dolphin.sleep();
        dolphin.call();
        dolphin.eat();
        System.out.println("*****EAGLE*****");
        eagle.sleep();
        eagle.call();
        eagle.eat();

        // Esercizio: step 2
    }
}
