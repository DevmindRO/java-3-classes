package com.devmind.springapp;

public class MyBean {
    static int objectCounter = 0;
    public String test;

    public MyBean() {
        objectCounter++;
        System.out.println("Current number of instances: " + objectCounter);
    }

    public MyBean(String test) {
        this.test = test;
    }

    private void init() {
        System.out.println("This method is called at initialization");
    }

    private void destroy() {
        System.out.println("This method is called at destruction. Use this to free resources.");
    }
}