package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringAppV2{

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        JavaTeacher theTeacher = context.getBean("myTeacher", JavaTeacher.class);

        // call methods on the bean
        System.out.println(theTeacher.getWisdom());
        System.out.println(theTeacher.getHomework());
        System.out.println(theTeacher.getWorkPlace());

        // close the context
        context.close();
    }

}
