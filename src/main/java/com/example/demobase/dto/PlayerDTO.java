package com.example.demobase.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PlayerDTO {
    private Long id;
    private String nombre;
    private LocalDate fecha;

    public PlayerDTO() {
    }

    public PlayerDTO(Long id, String nombre, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
