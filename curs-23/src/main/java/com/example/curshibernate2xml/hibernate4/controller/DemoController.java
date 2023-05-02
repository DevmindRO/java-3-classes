package com.example.curshibernate2xml.hibernate4.controller;

import com.example.curshibernate2xml.hibernate4.dtos.StudentSuccessResponseDTO;
import com.example.curshibernate2xml.hibernate4.model.Adresa;
import com.example.curshibernate2xml.hibernate4.model.Profesor;
import com.example.curshibernate2xml.hibernate4.model.Student;
import com.example.curshibernate2xml.hibernate4.repository.AdresaRepository;
import com.example.curshibernate2xml.hibernate4.repository.ProfesorRepository;
import com.example.curshibernate2xml.hibernate4.repository.StudentRepository;

import com.example.curshibernate2xml.hibernate4.service.StudentService;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/demo")
@PreAuthorize("hasAnyAuthority('ADMIN')")
public class DemoController {

    @PersistenceContext
    EntityManager entityManager;

    private final StudentRepository studentRepository;
    private final AdresaRepository adresaRepository;
    private final ProfesorRepository profesorRepository;
    private final StudentService studentService;


    @Autowired
    public DemoController(StudentRepository studentRepository, AdresaRepository adresaRepository, ProfesorRepository profesorRepository, StudentService studentService) {
        this.studentRepository = studentRepository;
        this.adresaRepository = adresaRepository;
        this.profesorRepository = profesorRepository;
        this.studentService = studentService;
    }


    @GetMapping(path = "/student/all")
    public @ResponseBody
    ResponseEntity<List<StudentSuccessResponseDTO>> getStudents(@RequestParam(name = "page", required = false) Integer page) {
        Iterable<Student> allStudents = studentService.getAll(page);

        List<StudentSuccessResponseDTO> response = new ArrayList<>();
        for(Student student: allStudents) {
            response.add(new StudentSuccessResponseDTO(student.getId(), student.getNume(), student.getPrenume(), student.getCursuriAlese()));
        }

        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }

    @GetMapping(path = "/adresa/all")
    public @ResponseBody
    Iterable<Adresa> getAddresses() {
        return adresaRepository.findAll();
    }

    @GetMapping(path = "/profesor/all")
    public @ResponseBody
    Iterable<Profesor> getProfesori() {
        return profesorRepository.findAll();
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

    @GetMapping(path = "/student/cnp/{cnp}")
    public @ResponseBody
    Iterable<Student> getStudent(@PathVariable String cnp) {
        Session session = (Session) entityManager.getDelegate();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get("cnp"), cnp));

        Query<Student> query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }
}
