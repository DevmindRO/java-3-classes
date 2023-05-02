package com.example.curshibernate2xml.hibernate4.controller;

import com.example.curshibernate2xml.hibernate4.model.Materie;
import com.example.curshibernate2xml.hibernate4.repository.MaterieRepository;
import com.example.curshibernate2xml.hibernate4.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/courses")
//@PreAuthorize("hasAnyAuthority('ADMIN')")
public class CourseController {
    private final ProfesorRepository profesorRepository;

    private final MaterieRepository materieRepository;

    @Autowired
    public CourseController(ProfesorRepository profesorRepository, MaterieRepository materieRepository) {
        this.profesorRepository = profesorRepository;
        this.materieRepository = materieRepository;
    }

    @GetMapping(path = "/all")
    @PreAuthorize("hasAuthority('ADMIN')")
    public @ResponseBody ResponseEntity<List<Materie>> getCourses() {
        List<Materie> courses = materieRepository.findAll();
        return new ResponseEntity<>(courses, HttpStatus.ACCEPTED);
    }

    @GetMapping(path = "/{courseId}")
    //@PostAuthorize("returnObject.profesor.nume == principal.username")
    @PostAuthorize("returnObject.profesor.nume == authentication.name")
    public @ResponseBody Materie getCourseById(@PathVariable Integer courseId) {
        return materieRepository.findById(courseId).orElseThrow(() -> new RuntimeException("Course not found"));
    }


    @GetMapping(path = "/all2")
    @PreAuthorize("principal.username == 'admin'")
    public @ResponseBody
    ResponseEntity<List<Materie>> getCourses2() {
        List<Materie> courses = materieRepository.findAll();
        return new ResponseEntity<>(courses, HttpStatus.ACCEPTED);
    }

    @GetMapping(path = "/all3")
    @PostAuthorize("authentication.name == 'admin'")
    public @ResponseBody
    ResponseEntity<List<Materie>> getCourses3() {
        List<Materie> courses = materieRepository.findAll();
        return new ResponseEntity<>(courses, HttpStatus.ACCEPTED);
    }
}
