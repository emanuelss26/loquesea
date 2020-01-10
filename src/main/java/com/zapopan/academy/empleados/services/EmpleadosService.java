package com.zapopan.academy.empleados.services;

import com.zapopan.academy.empleados.dao.EmpleadoDao;
import com.zapopan.academy.empleados.dao.TiposUsuarioDao;
import com.zapopan.academy.empleados.dto.EmpleadoDto;
import com.zapopan.academy.empleados.entities.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadosService {

    @Autowired
    private EmpleadoDao empleadoDao;

    @Autowired
    private TiposUsuarioDao tiposUsuarioDao;

    public Empleado crearOActualizar(EmpleadoDto empleadoDto){
        Empleado empleado = new Empleado();
        empleado.setPrimerNombre(empleadoDto.getPrimerNombre());
        empleado.setTiposUsuario(tiposUsuarioDao.findByTipo(empleadoDto.getTipoUsuario()));
        return empleadoDao.save(empleado);
    }


}
