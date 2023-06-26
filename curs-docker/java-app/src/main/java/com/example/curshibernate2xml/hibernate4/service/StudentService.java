package com.example.curshibernate2xml.hibernate4.service;

import com.example.curshibernate2xml.hibernate4.model.Student;
import com.example.curshibernate2xml.hibernate4.repository.StudentRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    private final StudentRepository studentRepository;

    private final static int STUDENTS_PER_PAGE = 3;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Iterable<Student> getAll(Integer page) {
        if (page != null) {
            Pageable pageToSearchFor = PageRequest.of(page, STUDENTS_PER_PAGE);
            return studentRepository.findAll(pageToSearchFor);
        }
        return studentRepository.findAll();
    }
}
