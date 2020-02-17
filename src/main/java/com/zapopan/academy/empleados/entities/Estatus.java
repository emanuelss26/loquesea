package com.zapopan.academy.empleados.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class Estatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String Asistio ;

    @Column
    private String Confirmado ;

    @Column
    private String Marcado_unavez;

    @Column
    private String Marcado_dosveces;

    @Column 
    private String Marcado_tresveces;

    @Column
    private String Sin_Confirmar;

    @Column
    private String Observaciones;

    @OneToMany (mappedBy = "status")
    private List <Asistente> asistentes;

}