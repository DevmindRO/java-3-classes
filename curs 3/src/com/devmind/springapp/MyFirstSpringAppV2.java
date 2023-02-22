package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringAppV2{

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        ITeacher theTeacher = context.getBean("myTeacher", ITeacher.class);

        ITeacher historyTeacher = context.getBean("historyTeacher", ITeacher.class);

        // call methods on the bean
        System.out.println(theTeacher.getHomework());

        // close the context
        context.close();
    }

}
