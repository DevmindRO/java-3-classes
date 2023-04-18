package com.example.curshibernate2xml.hibernate3;

import javax.persistence.*;

@Entity(name = "PRODUSE_2")
@Table(name = "PRODUSE_2")
public class Produs2 {
    @Id
    private int id;
    @Column(name = "detalii")
    private String descriere;
    private int cantitate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}