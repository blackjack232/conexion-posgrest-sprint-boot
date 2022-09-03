package com.Java.com.CRUDJAVA.repository;

import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.model.Transacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransaccion extends JpaRepository<Transacion,Long> {
}
