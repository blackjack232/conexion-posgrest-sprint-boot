package com.Java.com.CRUDJAVA.model;



import lombok.Data;

import javax.persistence.*;



@Entity
@Table(name = "Perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String imagen;
    private String telefono;

}
