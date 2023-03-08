package com.devmind.annotation.springapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringAnnotationApp {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(TeacherConfiguration.class);

        WebDevTeacher teacher = annotationContext.getBean("webDevTeacher", WebDevTeacher.class);
        //teacher.printTeachingService();
        //teacher.printTipsAndTricks();

        System.out.println("Creating the second bean");
        WebDevTeacher secondTeacher = annotationContext.getBean("configClassWebDevTeacher", WebDevTeacher.class);
        secondTeacher.printTeachingService();
        secondTeacher.printTipsAndTricks();

        JavaTeacher javaTeacher = annotationContext.getBean("bestJavaTeacher", JavaTeacher.class);
        System.out.println(javaTeacher.getHomeWork());

        annotationContext.close();
    }
}