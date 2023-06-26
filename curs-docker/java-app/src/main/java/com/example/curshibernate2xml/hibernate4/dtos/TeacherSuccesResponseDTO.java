package com.example.curshibernate2xml.hibernate4.dtos;

import com.example.curshibernate2xml.hibernate4.model.Materie;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@AllArgsConstructor
@Getter
public class TeacherSuccesResponseDTO {
    private long id;
    private String name;
    private Set<Materie> courses;
}
