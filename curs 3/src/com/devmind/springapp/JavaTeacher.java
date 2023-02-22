package com.devmind.springapp;

public class JavaTeacher implements ITeacher{

    @Override
    public String getHomework() {
        return "Create 100 classes";
    }
}