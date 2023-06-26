package com.example.curshibernate2xml.hibernate4.repository;

import com.example.curshibernate2xml.hibernate4.model.Materie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterieRepository extends JpaRepository<Materie, Integer> {

}