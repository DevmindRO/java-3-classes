package com.example.curshibernate2xml.hibernate4.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequestDTO {
    private String email;
    private String role;
    private String password;
}