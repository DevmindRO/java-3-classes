package com.devmind.springapp;

import org.springframework.stereotype.Component;

@Component
public class TipsAndTricksService implements ITeachingService{

    @Override
    public String teachSomething() {
        return "Always be thorough and learn from your mistakes!";
    }
}
