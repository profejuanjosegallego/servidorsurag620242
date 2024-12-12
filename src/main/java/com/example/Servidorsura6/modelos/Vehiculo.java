package com.example.Servidorsura6.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Vehiculo {


    //ID(AUTO LONG)
    private Long Id;
    //PLACA (STRING)
    private String placa;


    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id")
    private Usuario usuario;

    public Vehiculo() {
    }

    public Vehiculo(Long id, String placa) {
        Id = id;
        this.placa = placa;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
