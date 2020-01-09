package com.zapopan.academy.empleados.dao;

import com.zapopan.academy.empleados.entities.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoDao extends CrudRepository<Empleado, Integer> {
}
