package com.example.curshibernate2xml.hibernate4.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class TeacherRequestDTO {
    private String teacherName;
    private String courseName;
}
