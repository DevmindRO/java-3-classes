package com.devmind.springapp;

public class JavaTeacher implements ITeacher{

    private WisdomWordsService wisdomService;
    private HomeworkService homeworkService;
    private int age;
    private String workPlace;

    // constructor unic care primeste ca parametru un obiect de tipul WisdomWordsService
    public JavaTeacher(WisdomWordsService wisdomService, HomeworkService homeworkService) {
        this.wisdomService = wisdomService;
        this.homeworkService = homeworkService;
    }

    @Override
    public String getHomework() {
        return homeworkService.getMessage();
    }

    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public int getAge() {
        return age;
    }

    public String getWorkPlace() {
        return workPlace;
    }
}