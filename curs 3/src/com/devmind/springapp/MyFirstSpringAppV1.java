package com.devmind.springapp;

public class MyFirstSpringAppV1 {

    public static void main(String[] args) throws Exception {

        MyContainer container = new MyContainer();

        // create the object
        ITeacher theTeacher = new JavaTeacher();
//        ITeacher theTeacher = container.getTeacher(TeacherType.MATH);

        // use the object
        System.out.println(theTeacher.getHomework());
    }

}