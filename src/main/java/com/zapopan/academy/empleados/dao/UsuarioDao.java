package com.zapopan.academy.empleados.dao;

import com.zapopan.academy.empleados.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Integer> {
}
