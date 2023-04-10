package com.devmind.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*@Component()
public class WebDevTeacher {

    TipsAndTricksService tipsAndTricksService;
    FrameworkKnowledge frameworkKnowledge;

    @Autowired
    private void setFrameworkKnowledge(FrameworkKnowledge frameworkKnowledge) {
        this.frameworkKnowledge = frameworkKnowledge;
    }

    @Autowired(required = false)
    private void setTipsAndTricksService(TipsAndTricksService tipsAndTricksService) {
        this.tipsAndTricksService = tipsAndTricksService;
    }

    public void printKnowledge() {
        System.out.println(frameworkKnowledge.getSomeKnowledge());
    }

    public void printTip() {
        if (tipsAndTricksService != null) {
            System.out.println(tipsAndTricksService.teachSomething());
        }
    }
}

 */

@Component()
public class WebDevTeacher {
    @Autowired
    private ITeachingService tipsAndTricksService;

    public void printKnowledge() {
        System.out.println(tipsAndTricksService.teachSomething());
    }
}


/*
@Component()
public class com.devmind.springapp.WebDevTeacher {
    @Autowired(required = false)
    TipsAndTricksService tipsAndTricksService;
    @Autowired
    FrameworkKnowledge frameworkKnowledge;

    public void printKnowledge() {
        System.out.println(frameworkKnowledge.getSomeKnowledge());
    }

    public void printTip() {
        if (tipsAndTricksService != null) {
            System.out.println(tipsAndTricksService.getTip());
        }
    }
}
 */