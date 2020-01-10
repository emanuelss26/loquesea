package com.zapopan.academy.empleados.controllers;

import com.zapopan.academy.empleados.dto.EmpleadoDto;
import com.zapopan.academy.empleados.entities.Empleado;
import com.zapopan.academy.empleados.services.EmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/empleados")
public class EmpleadosController {

    @Autowired
    private EmpleadosService empleadosService;

    @RequestMapping(value = "/crear", method = RequestMethod.POST)
    public EmpleadoDto crearEmpleado(@RequestBody EmpleadoDto empleadoDto){
        Empleado empleado = empleadosService.crearOActualizar(empleadoDto);

        EmpleadoDto respuesta = new EmpleadoDto();
        respuesta.setId(empleado.getId());
        respuesta.setPrimerNombre(empleado.getPrimerNombre());
        respuesta.setTipoUsuario(empleado.getTiposUsuario().getTipo());

        return respuesta;
    }
}
