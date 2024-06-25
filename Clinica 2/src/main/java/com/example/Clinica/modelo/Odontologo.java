package com.example.Clinica.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "odontologo")
public class Odontologo {

    @Column(name = "nombre")
    private String nombre;

    @Id
    @Column(name = "numero_profesional") //lo que sale en la table
    private String numeroProfesional; // me sale en java ASDAS6757123

    @Column(name = "cedula")
    private Integer cedula;

    @Column(name = "horario_de_trabajo")
    private String horarioDeTrabajo;

    public Odontologo(){
        
    }

    public Odontologo(String nombre, String numeroProfesional, Integer cedula, String horarioDeTrabajo) {
        this.nombre = nombre;
        this.numeroProfesional = numeroProfesional;
        this.cedula = cedula;
        this.horarioDeTrabajo = horarioDeTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroProfesional() {
        return numeroProfesional;
    }

    public Integer getCedula() {
        return cedula;
    }

    public String getHorarioDeTrabajo() {
        return horarioDeTrabajo;
    }
}
