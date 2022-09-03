package com.Java.com.CRUDJAVA.repository;

import com.Java.com.CRUDJAVA.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IEmpleado extends JpaRepository<Empleado,Long> {
    @Override
    List<Empleado> findAll();

    boolean existsById(Long cedula);

    Optional<Empleado> findById(String cedula);

}
