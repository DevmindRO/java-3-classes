package com.devmind.springapp;

public class MyFirstSpringAppV1 {
    public static void main(String[] args) {
        WisdomWordsService wisdomWordsService = new WisdomWordsService();
        HomeworkService homeworkService = new HomeworkService();

        JavaTeacher javaTeacher = new JavaTeacher(wisdomWordsService, homeworkService);
    }
}