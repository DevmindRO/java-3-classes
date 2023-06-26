package com.example.curshibernate2xml.hibernate4.repository;

import com.example.curshibernate2xml.hibernate4.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Optional<Student> findByNume(String nume);

    Optional<Student> findByNumeAndPrenume(String nume, String prenume);

    @Query("SELECT s FROM Student s WHERE s.nume = ?1")
    List<Student> findByNumeUsingQuery(String nume);

    @Query(value = "SELECT * FROM studenti " +
            "JOIN adrese_studenti on studenti.id_adresa = adrese_studenti.id " +
            "WHERE " +
                "studenti.nume = ?1 " +
                "and adrese_studenti.localitate = ?2",
            nativeQuery = true)
    List<Optional<Student>> findByNumeAndLocalitate(String nume, String localitate);

    @Query(value = "SELECT * FROM studenti  WHERE studenti.nume = ?1", nativeQuery = true)
    List<Optional<Student>> findByNumeSpecial2(String nume);


}