package com.zapopan.academy.empleados.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String primerNombre;

    @ManyToOne
    @JoinColumn
    private TiposUsuario tiposUsuario;
   
    @ManyToMany
    private List <Evento> eventos;

}
