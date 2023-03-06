package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp
{
    public static void main(String args[]) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBean myBean1 = context.getBean("myBean1", MyBean.class);
        MyBean myBean2 = context.getBean("myBean2", MyBean.class);

        System.out.println(myBean1 == myBean2);

        MyBean myBean3 = context.getBean("myBean1", MyBean.class);
        MyBean myBean4 = context.getBean("myBean1", MyBean.class);
        System.out.println(myBean3 == myBean4);
    }
}
