package com.devmind.springapp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component()
@Scope("prototype")
public class WebDevTeacher2 implements DisposableBean {

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> WebDevTeacher: inside doMyStartupStuff()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(">> WebDevTeacher: inside destroy()");
    }
}