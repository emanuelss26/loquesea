package com.zapopan.academy.empleados.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TiposUsuario {

    @Id
    private Integer id;

    @Column
    private String tipo;
}
