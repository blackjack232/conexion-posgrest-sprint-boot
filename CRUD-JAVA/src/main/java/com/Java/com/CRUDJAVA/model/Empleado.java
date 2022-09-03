package com.Java.com.CRUDJAVA.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Empleado")

public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String  nombre;
    private Long  cedula;

    public Empleado( ) {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }
/*
    @OneToOne
    @JoinColumn(name = "idPerfil")
    Perfil perfil ;
    Enum_rol rol;
    @OneToOne
    @JoinColumn(name = "idEmpresa")
    Empresa empresaEmpleado;

*/



}
