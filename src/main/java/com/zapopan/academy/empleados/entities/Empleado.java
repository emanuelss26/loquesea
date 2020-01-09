package com.zapopan.academy.empleados.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
public class Empleado {

    @Id
    private Integer id;

    @Column
    private String primerNombre;

    @OneToOne
    private TiposUsuario tiposUsuario;
}
