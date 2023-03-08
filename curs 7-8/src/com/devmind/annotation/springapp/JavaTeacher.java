package com.devmind.annotation.springapp;

import org.springframework.stereotype.Component;

@Component(value = "bestJavaTeacher")
public class JavaTeacher implements ITeacher {

    @Override
    public String getHomeWork() {
        return "Create 100 classes";
    }
}