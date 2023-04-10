package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringAppV2 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // obtine bean-ul din container-ul de spring
        WebDevTeacher teacher = context.getBean("webDevTeacher", WebDevTeacher.class);
        // foloseste functionalitatile bean-ului
        teacher.printKnowledge();
        // inchide contextul
        context.close();
    }

}
