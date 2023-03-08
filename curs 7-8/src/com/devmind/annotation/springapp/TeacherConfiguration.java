package com.devmind.annotation.springapp;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@Import(ServiceConfiguration.class)
public class TeacherConfiguration {
    @Bean
    public WebDevTeacher configClassWebDevTeacher() {
        return new WebDevTeacher();
    }
}
