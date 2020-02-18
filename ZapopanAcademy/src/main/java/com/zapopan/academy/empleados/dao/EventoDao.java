package com.zapopan.academy.empleados.dao;

import com.zapopan.academy.empleados.entities.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoDao extends CrudRepository<Evento, Integer> {
}
