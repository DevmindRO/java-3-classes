package com.devmind.annotation.springapp;

import org.springframework.stereotype.Component;

@Component
public class FrontEndKnowledge implements ITeachingService {
    @Override
    public String teachSomething() {
        return "Front end frameworks are your friend, not your enemy!";
    }
}
