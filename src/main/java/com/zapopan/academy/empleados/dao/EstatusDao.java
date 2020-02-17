package com.zapopan.academy.empleados.dao;

import com.zapopan.academy.empleados.entities.Estatus;
import org.springframework.data.repository.CrudRepository;

public interface EstatusDao extends CrudRepository<Estatus, Integer> {
}
