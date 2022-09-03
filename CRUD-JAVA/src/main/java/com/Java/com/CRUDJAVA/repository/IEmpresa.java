package com.Java.com.CRUDJAVA.repository;

import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpresa extends JpaRepository<Empresa,Long> {
}
