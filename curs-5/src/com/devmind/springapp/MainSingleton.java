package com.devmind.springapp;

public class MainSingleton {

    public static void main(String[] args) {
        Singleton.getInstance();
    }

    public void doSmt(Singleton instance) {
        System.out.println(instance);
    }
}
