package com.Java.com.CRUDJAVA.repository;

import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPerfil extends JpaRepository<Perfil,Long> {
}
