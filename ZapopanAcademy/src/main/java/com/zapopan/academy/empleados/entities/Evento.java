package com.zapopan.academy.empleados.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String Nombre_Evento ;

    @Column
    private String Descripcion;

    @Column
    private Integer fecha_inicio;

    @Column
    private Integer fecha_final ;

    @ManyToMany (mappedBy = "eventos")
    private List <Empleado> empleados;

    @ManyToMany 
    private List<Asistente> asistentes;


}