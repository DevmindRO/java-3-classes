package com.devmind.springapp;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("I'm singleton");
    }

    synchronized public static Singleton getInstance() {
       return instance;
    }
}
