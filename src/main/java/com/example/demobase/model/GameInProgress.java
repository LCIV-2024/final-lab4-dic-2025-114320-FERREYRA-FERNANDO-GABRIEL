package com.example.demobase.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "games_in_progress")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameInProgress {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_jugador", nullable = false)
    private Player jugador;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_palabra", nullable = false)
    private Word palabra;
    
    @Column(nullable = false, length = 1000)
    private String letrasIntentadas; // Almacenadas como String separado por comas: "A,B,C"
    
    @Column(nullable = false)
    private Integer intentosRestantes;
    
    @Column(nullable = false)
    private LocalDateTime fechaInicio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getJugador() {
        return jugador;
    }

    public void setJugador(Player jugador) {
        this.jugador = jugador;
    }

    public Word getPalabra() {
        return palabra;
    }

    public void setPalabra(Word palabra) {
        this.palabra = palabra;
    }

    public String getLetrasIntentadas() {
        return letrasIntentadas;
    }

    public void setLetrasIntentadas(String letrasIntentadas) {
        this.letrasIntentadas = letrasIntentadas;
    }

    public Integer getIntentosRestantes() {
        return intentosRestantes;
    }

    public void setIntentosRestantes(Integer intentosRestantes) {
        this.intentosRestantes = intentosRestantes;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
