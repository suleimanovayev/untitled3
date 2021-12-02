package com.ua;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        System.out.println(animal.hashCode());
        System.out.println(human.hashCode());
    }

}
