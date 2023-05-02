package com.example.curshibernate2xml.hibernate4.repository;

import com.example.curshibernate2xml.hibernate4.model.Adresa;
import com.example.curshibernate2xml.hibernate4.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

}