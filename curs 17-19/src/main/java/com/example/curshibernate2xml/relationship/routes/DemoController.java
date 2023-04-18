package com.example.curshibernate2xml.relationship.routes;

import com.example.curshibernate2xml.relationship.model.Student;
import com.example.curshibernate2xml.relationship.dtos.StudentSuccessResponseDTO;
import com.example.curshibernate2xml.relationship.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping(path = "/demo")
public class DemoController {
    private final StudentRepository studentRepository;

    @Autowired
    public DemoController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @GetMapping(path = "/student/all")
    public @ResponseBody
    ResponseEntity<List<Student>> getStudents(@RequestParam(name = "page", required = false) Integer page) {
        Iterable<Student> allStudents = studentRepository.findAll();

        List<Student> studentsList = StreamSupport.stream(allStudents.spliterator(), false)
                .collect(Collectors.toList());

        List<StudentSuccessResponseDTO> response = new ArrayList<>();
        for(Student student: allStudents) {
            response.add(new StudentSuccessResponseDTO(student.getId(), student.getNume(), student.getPrenume(), student.getCursuriAlese()));
        }

        return new ResponseEntity<>(studentsList, HttpStatus.ACCEPTED);
    }

    @GetMapping(path = "/student")
    public @ResponseBody
    Optional<Student> getStudentByNumeAndPrenume(@RequestParam(name = "nume") String nume, @RequestParam(name = "prenume", required = false) String prenume) {
        if (prenume == null) {
            return studentRepository.findByNume(nume);
        }
        return studentRepository.findByNumeAndPrenume(nume, prenume);
    }

    @GetMapping(path = "/student/localitate")
    public @ResponseBody
    List<Optional<Student>> getStudentByNumeAndLocalitate(@RequestParam(name = "nume") String nume, @RequestParam(name = "localitate") String localitate) {
        return studentRepository.findByNumeAndLocalitate(nume, localitate);
    }

}
