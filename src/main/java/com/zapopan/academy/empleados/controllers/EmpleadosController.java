package com.zapopan.academy.empleados.controllers;

import com.zapopan.academy.empleados.services.EmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/empleados")
public class EmpleadosController {

    @Autowired
    private EmpleadosService empleadosService;

    @RequestMapping(value = "/getString", method = RequestMethod.GET)
    public String getString(){
        return "Hola Zapopan Academy!";
    }
}
