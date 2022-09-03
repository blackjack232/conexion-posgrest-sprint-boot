package com.Java.com.CRUDJAVA.model;



import lombok.Data;

import javax.persistence.*;



@Entity
@Table
public class Transacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String  concepto;
    private String  monto;
    /*
    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    Empleado empleado;
    @ManyToOne
    @JoinColumn(name = "idEmpresaEmpleado")
    Empresa empresaEmpleado;
*/
}
