package com.devmind.annotation.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringAnnotationApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ITeacher teacher = context.getBean("bestJavaTeacher", ITeacher.class);

        System.out.println(teacher.getHomeWork());

        context.close();
    }
}