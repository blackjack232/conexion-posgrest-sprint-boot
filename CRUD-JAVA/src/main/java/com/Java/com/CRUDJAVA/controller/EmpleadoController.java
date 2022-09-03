package com.Java.com.CRUDJAVA.controller;

import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.model.Mensaje;
import com.Java.com.CRUDJAVA.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping
    public ResponseEntity<Empleado> guardarEmpleado(@RequestBody Empleado empleado){
        return ResponseEntity.status(HttpStatus.CREATED).body(empleadoService.guardarEmpleado(empleado));
    }

    @GetMapping ("/empleados")
    public List<Empleado> buscarEmpleados(){

        return empleadoService.buscarEmpleados();
    }

    @GetMapping ("/empleado/{cedula}")
    public ResponseEntity<Empleado> buscarEmpleado(@PathVariable("cedula") Long cedula){
        if (!empleadoService.existsByIdEmpleado(cedula)){
            return new ResponseEntity(new Mensaje("No existe el  empleado"), HttpStatus.NOT_FOUND);
        }else {
            Empleado empleado = empleadoService.getEmpleado(cedula).get();
            return new ResponseEntity(empleado, HttpStatus.OK);
        }


    }



}
