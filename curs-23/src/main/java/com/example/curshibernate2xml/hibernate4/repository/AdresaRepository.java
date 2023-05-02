package com.example.curshibernate2xml.hibernate4.repository;

import com.example.curshibernate2xml.hibernate4.model.Adresa;
import com.example.curshibernate2xml.hibernate4.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresaRepository extends JpaRepository<Adresa, Integer> {

}