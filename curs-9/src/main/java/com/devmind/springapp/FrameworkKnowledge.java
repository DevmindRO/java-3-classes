package com.devmind.springapp;

import org.springframework.stereotype.Component;

@Component
public class FrameworkKnowledge implements ITeachingService {
    public String getSomeKnowledge() {
        return "Frameworks are your friend, not your enemy!";
    }

    @Override
    public String teachSomething() {
        return "Frameworks are your friend, not your enemy!";
    }
}