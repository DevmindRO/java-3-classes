package com.example.curshibernate2xml.relationship.dtos;

import com.example.curshibernate2xml.relationship.model.Materie;
import lombok.Data;

import java.util.Set;


@Data
public class StudentSuccessResponseDTO {
    private final Integer id;
    private final String nume;
    private final String prenume;
    private final Set<Materie> cursuriAlese;
}
