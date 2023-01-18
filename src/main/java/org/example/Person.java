package org.example;

public class Person implements IPerson {
    // Object Vars
    String name;
    byte age;
    short weight;

    public Person(String name, int age, int weight) {
        this.name = name;
        this.age = (byte) age;
        this.weight = (short) weight;
    }
    public void say_hello() {System.out.println("Hello I'm " + this.name + "! I'm " + this.age + " years old! :3");}
    public static void say_bye() {System.out.println("Good Bye!");}
    public void say_self_weight() {System.out.println("My weight is " + this.weight);}
}
