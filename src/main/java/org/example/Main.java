package org.example;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Random values generator
        Random rand = new Random();

        // Names List
        String[] names = new String[] {
                "Howdy",
                "Murphy",
                "Thomas",
                "Rambo",
                "Stallone",
                "Rocky",
                "Elliot",
                "Gosha",
                "Net",
                "KingT"
        };

        // Person List Generating
        Person p[] = new Person[5];

        for (byte i = 0; i < p.length; i++) {
            p[i] = new Person(names[rand.nextInt(names.length)], rand.nextInt(128), rand.nextInt(200));
        }

        // Person List Printng
        System.out.println("\n------------------------------------------------------\n");
        for (Person pr : p) {
            pr.say_hello();
            pr.say_self_weight();
            pr.say_bye();
            System.out.println("\n------------------------------------------------------\n");
        }
    }
}
