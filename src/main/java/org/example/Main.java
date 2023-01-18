package org.example;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
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

        Person p[] = new Person[5];

        for (byte i = 0; i < p.length; i++) {
            p[i] = new Person(names[rand.nextInt(names.length)], rand.nextInt(128), rand.nextInt(200));
        }

        System.out.println("\n------------------------------------------------------\n");
        for (Person pr : p) {
            pr.say_hello();
            pr.say_self_weight();
            pr.say_bye();
            System.out.println("\n------------------------------------------------------\n");
        }
    }
}
