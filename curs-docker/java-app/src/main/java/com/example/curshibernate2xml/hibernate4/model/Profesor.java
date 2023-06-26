package com.example.curshibernate2xml.hibernate4.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "profesori")
@Data
public class Profesor {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nume")
    private String nume;

    @OneToMany(mappedBy = "profesor")
    @JsonIgnore
    private Set<Materie> materiiPredate;
}