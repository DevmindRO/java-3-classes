package com.devmind.annotation.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WebDevTeacher implements ITeacher {
    @Autowired
    ITeachingService frameworkKnowledge;

    @Autowired(required = false)
    TipsAndTricksService tipsAndTricksService;


    /*
    @Autowired
    public WebDevTeacher(ITeachingService teachingService) {
        this.frameworkKnowledge = teachingService;
    }

     */

/*
    @Autowired
    @Qualifier("frameworkKnowledge")
    public void setTeachingService(ITeachingService teachingService) {
        this.teachingService = teachingService;
    }

 */

    private void setTipsAndTricksService(TipsAndTricksService tipsAndTricksService) {
        this.tipsAndTricksService = tipsAndTricksService;
    }

    public void printTeachingService() {
        System.out.println(frameworkKnowledge.teachSomething());
    }

    public void printTipsAndTricks() {
        System.out.println(tipsAndTricksService.getTip());
    }

    @Override
    public String getHomeWork() {
        return "Create your server backend context!";
    }
}