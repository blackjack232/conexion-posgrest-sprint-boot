package com.Java.com.CRUDJAVA.service;

import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.repository.IEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    private IEmpleado iEmpleado;

    @Autowired
    public void setRepositiry (IEmpleado  iEmpleado){
        this.iEmpleado = iEmpleado;
    }
    public Empleado guardarEmpleado(Empleado empleado){
        //if(empleado.getId() != null){
            return iEmpleado.save(empleado);
       // }
       //return null;
    }
    public List<Empleado> buscarEmpleados(){
        return iEmpleado.findAll();

    }
    public boolean existsByIdEmpleado(Long cedula){
        return iEmpleado.existsById(cedula);
    }
    public Optional<Empleado> getEmpleado(Long cedula){
        return  iEmpleado.findById(cedula);
    }

}
