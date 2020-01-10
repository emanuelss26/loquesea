package com.zapopan.academy.empleados.dao;

import com.zapopan.academy.empleados.entities.TiposUsuario;
import org.springframework.data.repository.CrudRepository;

public interface TiposUsuarioDao extends CrudRepository<TiposUsuario, Integer> {
    TiposUsuario findByTipo(String tipo);
}
